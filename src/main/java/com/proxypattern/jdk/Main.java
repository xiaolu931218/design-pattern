package com.proxypattern.jdk;

public class Main {

    /**
     * 这是使用jdk创建代理模式
     * @param args
     */
    public static void main(String[] args) {

        BYD byd = new BYD();
        BYDProxy bydProxy = new BYDProxy();
        bydProxy.setTargetObject(byd);
        Car car = (Car) bydProxy.createProxyObject();
        car.drive();
    }

}
