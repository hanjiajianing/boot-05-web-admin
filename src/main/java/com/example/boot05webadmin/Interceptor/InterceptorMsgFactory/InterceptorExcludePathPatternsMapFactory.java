package com.example.boot05webadmin.Interceptor.InterceptorMsgFactory;

import com.example.boot05webadmin.Interceptor.interceptorMsg.InterceptorExcludePathPatternsMap;
import com.example.boot05webadmin.Interceptor.interceptorMsg.InterceptorPath;

public class InterceptorExcludePathPatternsMapFactory implements InterceptorPathFactory {
    @Override
    public InterceptorPath getInterceptorPath() {
        return new InterceptorExcludePathPatternsMap();
    }
}
