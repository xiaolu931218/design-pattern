package com.proxypattern.jdk;

public class Main {

    public static void main(String[] args) {

        BYD byd = new BYD();
        BYDProxy bydProxy = new BYDProxy();
        bydProxy.setTargetObject(byd);
        Car car = (Car) bydProxy.createProxyObject();
        car.drive();
    }

}
