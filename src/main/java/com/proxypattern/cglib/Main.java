package com.proxypattern.cglib;

public class Main {


    /**
     * 这是使用cglib方式来创建代理模式
     * @param args
     */
    public static void main(String[] args) {
        GeelyProxy geelyProxy = new GeelyProxy();
        Geely geely = (Geely) geelyProxy.creatProxyObj(Geely.class);
        geely.drive();
    }

}
