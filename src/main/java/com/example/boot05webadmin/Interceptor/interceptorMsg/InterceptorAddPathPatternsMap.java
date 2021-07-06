package com.example.boot05webadmin.Interceptor.interceptorMsg;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import java.util.HashMap;
import java.util.List;
public  class InterceptorAddPathPatternsMap implements InterceptorPath {
    HashMap<String, List<String>> PathPatternsMap=new HashMap<>();
    @Override
    public HashMap<String, List<String>> getPathPatternsMap() {
        return this.PathPatternsMap;
    }

    @Override
    public void setPathPatternsMap(HashMap<String, List<String>> PathPatternsMap) {
        this.PathPatternsMap=PathPatternsMap;
    }
}
