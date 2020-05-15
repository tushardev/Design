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

/*** This is example of lazy loading of singleton object. It is more efficient than eager loading*/
