package com.design.creational.singleton;

public class SingletonClone {

    private static SingletonClone instance = null;

    private SingletonClone() {
        if(instance == null) {
            throw new RuntimeException("Use getInstance method for getting the object");
        }
    }

    public static SingletonClone getInstance() {
        if(null == instance) {
            instance = new SingletonClone();
        }
        return instance;
    }
}

/**** Complete the example later for Clone of singleton object **/

