package com.pan.security;

import com.pan.Interceptor.ErrorPageInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 视图控制类，减少Controller书写
 *
 * Created by FantasticPan on 2018/6/4.
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ErrorPageInterceptor());
        WebMvcConfigurer.super.addInterceptors(registry);
    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/registry").setViewName("registry");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/code_error").setViewName("imagecode_wrong");
        registry.addViewController("/sign_in").setViewName("login");
        registry.addViewController("/sign_up").setViewName("registry");
        registry.addViewController("/person_index").setViewName("index");//为检测是否管理员可登录
        registry.addViewController("/failure_login").setViewName("failurelogin");
        registry.addViewController("/successful_login").setViewName("loginsuccesful");
//        registry.addViewController("/successful_admin_login").setViewName("adminloginsuccessful");
    }
}
