package com.singleton.destroy.reflect;

/**
 * 双重检查锁模式
 */
public class Singleton {

    private Singleton() {

    }

    /**
     * volatile 保证instance在内存可见性和防止CPU指令重排
     */
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
