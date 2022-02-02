package com.singleton.destroy.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射破坏单例
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton1 = constructor.newInstance();
        Singleton singleton2 = constructor.newInstance();
        // 这里的结果为false，说明不是单例
        System.out.println(singleton1 == singleton2);

    }
}
