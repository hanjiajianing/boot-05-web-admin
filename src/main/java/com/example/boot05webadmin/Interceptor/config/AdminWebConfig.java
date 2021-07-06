package com.example.boot05webadmin.Interceptor.config;

import com.example.boot05webadmin.Interceptor.InterceptorMsgFactory.InterceptorExcludePathPatternsMapFactory;
import com.example.boot05webadmin.Interceptor.interceptor.LoginInterceptor;
import com.example.boot05webadmin.Interceptor.interceptorMsg.InterceptorExcludePathPatternsMap;
import com.example.boot05webadmin.Interceptor.interceptorMsg.InterceptorPath;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.HashMap;
import java.util.List;

@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    InterceptorPath interceptorPath =new InterceptorExcludePathPatternsMapFactory().getInterceptorPath();

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        HashMap<String,List<String>> map=interceptorPath.getPathPatternsMap();

        InterceptorRegistration registration=registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**");
        for(List<String> i:map.values()){
            registration.excludePathPatterns(i);
        }
            //    .excludePathPatterns("/","/login","*.css","*.js","/**/*.css","/**/*.js")
              //  .excludePathPatterns("/**/**/*.css","/**/**/*.js","/**/*.jpg","/*.jpg","/**/*.png","/*.png");

    }
}
