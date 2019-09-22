package com.design.singleton;

public class SingletonUsingInnerClass {

    private static SingletonUsingInnerClass singleton;

    private SingletonUsingInnerClass() {}

    private static class SingletonHelper {

        private static final SingletonUsingInnerClass INSTANCE = new SingletonUsingInnerClass();
    }

    public static SingletonUsingInnerClass getInstance() {
        return SingletonHelper.INSTANCE;
    }
}


/*****
 * Here we have used static inner class to create instance.
 * The static will get loaded only when someone calls getInstance method. So it serves purpose of lazy initialization.
 * No need of syncronization.
 */
