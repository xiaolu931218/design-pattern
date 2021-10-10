package com.proxypattern.cglib;

public class Main {


    public static void main(String[] args) {
        GeelyProxy geelyProxy = new GeelyProxy();
        Geely geely = (Geely) geelyProxy.creatProxyObj(Geely.class);
        geely.drive();
    }

}
