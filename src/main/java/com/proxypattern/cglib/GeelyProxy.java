package com.proxypattern.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class GeelyProxy implements MethodInterceptor {


    /**
     *  根据一个类型产生代理类，此方法不要求一定放在MethodInterceptor中
     */
    public Object creatProxyObj(Class<?> clazz)
    {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
        // 这里增强
        System.out.println("开车前加油");
        return arg3.invokeSuper(arg0, arg2);
    }
}
