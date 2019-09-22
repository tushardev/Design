package com.design.singleton;

import java.lang.reflect.Constructor;

public class SingletonAndReflection {

    public static void main(String[] args) {
        destroySingleton();
        destroySingletonEnum();
    }

    /***
     *  Method to destroy Singleton
     */
    public static void destroySingleton() {
        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = null;

        Constructor[] constructors = Singleton.class.getDeclaredConstructors();

        try {
            for (Constructor constructor: constructors) {
                constructor.setAccessible(true);
                instanceTwo =  (Singleton) constructor.newInstance();
                break;
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(instanceOne);
        System.out.println(instanceTwo);
    }

    /***
     * Method to check if enum singleton can be destroyed using reflection.
     */
    public static void destroySingletonEnum() {
        EnumSingleton instanceOne = EnumSingleton.INSTANCE;
        EnumSingleton instanceTwo = null;

        Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();

        try {
            for (Constructor constructor: constructors) {
                constructor.setAccessible(true);
                instanceTwo =  (EnumSingleton) constructor.newInstance();
                break;
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(instanceOne);
        System.out.println(instanceTwo);
    }
}

/*****
 Here we have destroyed Singleton pattern using reflection.
 We have created 2 instances of Singleton class.

 We tried to break singleton for enum class which gave an error. Enum cannot be created using reflection.
 */