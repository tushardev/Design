package com.design.singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {}


    public static Singleton getInstance() {
        if(null == singleton) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
