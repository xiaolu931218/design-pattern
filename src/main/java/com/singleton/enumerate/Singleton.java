package com.singleton.enumerate;

/**
 * 枚举的方式
 */
public enum Singleton {

    INSTANCE;

    public void print() {
        System.out.println("我是枚举！");
    }

}
