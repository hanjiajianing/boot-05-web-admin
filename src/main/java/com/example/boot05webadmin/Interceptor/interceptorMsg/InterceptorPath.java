package com.example.boot05webadmin.Interceptor.interceptorMsg;

import java.util.HashMap;
import java.util.List;

public interface InterceptorPath {
    public HashMap<String,List<String>> getPathPatternsMap();
    public void  setPathPatternsMap(HashMap<String,List<String>> PathPatternsMap);
}
