package com.design.singleton;

import java.io.Serializable;

public class SingletonSerialized implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SingletonSerialized() {}

    private static class SingletonHelper {

        private static final SingletonSerialized INSTANCE = new SingletonSerialized();
    }

    public static SingletonSerialized getInstance() {
        return SingletonSerialized.SingletonHelper.INSTANCE;
    }

    /***
     * Implementing this method will prevent breaking singleton pattern by serialization
     * @return
     */
    protected Object readResolve() {
        return getInstance();
    }
}
