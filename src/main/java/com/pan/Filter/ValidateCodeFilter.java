package com.pan.Filter;

import com.pan.Exception.ValidateCodeException;
import com.pan.controller.ValidateCodeController;
import com.pan.entity.ImageCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component
public class ValidateCodeFilter extends OncePerRequestFilter {


    private AuthenticationFailureHandler failureHandler;

    private SessionStrategy sessionStrategy = new HttpSessionSessionStrategy();


    @Override
    public void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain)
            throws ServletException, IOException {
        if (StringUtils.equals("/login", httpServletRequest.getRequestURI())//表单对应
                && StringUtils.equalsIgnoreCase(httpServletRequest.getMethod(), "POST")) {
            try {
                validate( httpServletRequest);
            } catch (ValidateCodeException e) {
                httpServletResponse.sendRedirect("http://localhost:8080/code_error");
                return;
            }

        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }

    private void validate(HttpServletRequest servletWebRequest) throws ServletRequestBindingException {
        // 获取session中的验证码
        ServletWebRequest swr = new ServletWebRequest(servletWebRequest);
        ImageCode codeInSession = (ImageCode) sessionStrategy.getAttribute(swr, ValidateCodeController.SESSION_KEY_IMAGE_CODE);
        String codeInRequest = ServletRequestUtils.getStringParameter(servletWebRequest, "imageCode");

        if (StringUtils.isBlank(codeInRequest)) {
            throw new ValidateCodeException("验证码不能为空！");
        }
        if (codeInSession == null) {
            throw new ValidateCodeException("验证码不存在！");
        }
        if (codeInSession.isExpire()) {
            sessionStrategy.removeAttribute(swr, ValidateCodeController.SESSION_KEY_IMAGE_CODE);
            throw new ValidateCodeException("验证码已过期！");
        }
        if (!StringUtils.equalsIgnoreCase(codeInSession.getCode(), codeInRequest)) {
            throw new ValidateCodeException("验证码不正确！");
        }
        sessionStrategy.removeAttribute(swr, ValidateCodeController.SESSION_KEY_IMAGE_CODE);
    }
}


