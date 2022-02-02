package com.singleton.staticinner;

/**
 * 双重检查锁模式
 */
public class Singleton {

    private Singleton() {

    }

    /**
     * JVM在加载外部类时不会加载静态内部类，只有静态内部类的属性或方法被调用时，才会被加载，并初始化其静态属性
     * 由于static修饰的属性，因此只会被实例化一次，并且严格保证实例化顺序
     */
    private static class InnerClass {

        private static final Singleton INSTANCE = new Singleton();

    }


    public static Singleton getInstance() {
        return InnerClass.INSTANCE;
    }
}
