package com.pan.Handle;
//不同角色可登录不同界面
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

public class LoginSuccessHandle implements AuthenticationSuccessHandler {
    public void onAuthenticationSuccess(HttpServletRequest request,HttpServletResponse response, Authentication authentication) throws IOException , ServletException {

        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        String path = request.getContextPath();
        System.out.println(path);
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
        System.out.println(basePath);
        if (roles.contains("ROLE_ADMIN")) {
            response.sendRedirect(basePath + "successful_login");
            //可替换成别的界面
            return;
        }
        response.sendRedirect(basePath + "successful_login");
    }
}
