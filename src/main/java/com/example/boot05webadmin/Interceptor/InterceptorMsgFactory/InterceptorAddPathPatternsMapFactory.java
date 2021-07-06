package com.example.boot05webadmin.Interceptor.InterceptorMsgFactory;

import com.example.boot05webadmin.Interceptor.interceptorMsg.InterceptorAddPathPatternsMap;
import com.example.boot05webadmin.Interceptor.interceptorMsg.InterceptorPath;

public class InterceptorAddPathPatternsMapFactory implements InterceptorPathFactory{
    @Override
    public InterceptorPath getInterceptorPath() {
        return new InterceptorAddPathPatternsMap();
    }
}
