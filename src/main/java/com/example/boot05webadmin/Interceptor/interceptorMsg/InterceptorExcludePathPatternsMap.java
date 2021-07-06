package com.example.boot05webadmin.Interceptor.interceptorMsg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.util.pattern.PathPattern;

import java.util.*;

@Configuration
@ConfigurationProperties(prefix = "test")
public class InterceptorExcludePathPatternsMap implements InterceptorPath {

  HashMap<String,List<String>> PathPatternsMap=new HashMap<String, List<String>>();

    @Override
    public HashMap<String, List<String>> getPathPatternsMap() {

      //   PathPatternsMap.put("aa",new List<String>());

      List<String> js =new ArrayList<String>();
      List<String> css =new ArrayList<String>();
      List<String> login =new ArrayList<String>();
      List<String> another =new ArrayList<String>();
      List<String> image=new ArrayList<String>(Arrays.asList("/images/**"));
      css.add("/css/**");
      another.add("/fonts/**");
      js.add("/js/**");
      login.add("/login");
      login.add("/");
        PathPatternsMap.put("js",js);
        PathPatternsMap.put("css",css);
        PathPatternsMap.put("login",login);
        PathPatternsMap.put("image",image);
        PathPatternsMap.put("another",another);
        return this.PathPatternsMap;
    }

    @Override
    public void setPathPatternsMap(HashMap<String, List<String>> PathPatternsMap) {
    this.PathPatternsMap=PathPatternsMap;
    }
}
