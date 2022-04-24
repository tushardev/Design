package com.design.creational.singleton;

import java.lang.reflect.Constructor;

public class SingletonDemo {

    public static void main(String[] args) {

        testSingleton();

        testSingletonReflection();

    }

    private static void testSingleton() {
        DBSingleton singleton1 = DBSingleton.getInstance();

        DBSingleton singleton2 = DBSingleton.getInstance();

        if(singleton1 == singleton2) {
            System.out.println("Both Objects are same");
        }
    }

    private static void testSingletonReflection() {
        SingletonReflection instance = null;
        Constructor[] constructors = SingletonReflection.class.getDeclaredConstructors();

        try {
            for (Constructor constructor: constructors) {
                constructor.setAccessible(true);
                instance =  (SingletonReflection) constructor.newInstance();
                break;
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(instance);
    }
}
