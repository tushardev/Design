package com.design.singleton;

public class SingletonThreadSafe {

    private static SingletonThreadSafe singleton;

    private SingletonThreadSafe() {}

    public static SingletonThreadSafe getInstance() {
        if(singleton == null) {
            synchronized (SingletonThreadSafe.class) {
                if(singleton == null) {
                    singleton = new SingletonThreadSafe();
                }
            }
        }
        return singleton;
    }
}

/*****
 * Here we have used double lock checking to create singleton class.
 * Instead of making complete getInstance method syncronized which will cause performance issue
 * only syncronize creation part if instance is null.
 */
