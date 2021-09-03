package com.wang.util;

public class ServiceFactory {
    //取得李四对象
    public static Object getService(Object service){
        return new TransactionInvocationHandler(service).getProxy();

    }
}
