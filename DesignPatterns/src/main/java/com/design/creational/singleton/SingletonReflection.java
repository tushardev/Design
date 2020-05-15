package com.design.creational.singleton;

public class SingletonReflection {

    private static SingletonReflection instance = null;

    private SingletonReflection() {
        if(instance == null) {
            throw new RuntimeException("Use getInstance method for getting the object");
        }
    }

    public static SingletonReflection getInstance() {
        if(null == instance) {
            instance = new SingletonReflection();
        }
        return instance;
    }
}


/*** Throw Runtime exception from constructor if instance is null to make singleton class safe from Reflection
 *
 */
