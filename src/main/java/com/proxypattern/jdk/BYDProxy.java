package com.proxypattern.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BYDProxy implements InvocationHandler {

    // 被代理的类
    private Object targetObject;

    public void setTargetObject(Object targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("BYD的代理类打印...");
        return method.invoke(targetObject, args);
    }

    /**
     * 生产代理类
     * @return
     */
    public Object createProxyObject() {
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }
}
