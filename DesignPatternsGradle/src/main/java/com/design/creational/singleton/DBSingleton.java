package com.design.creational.singleton;


public class DBSingleton implements Cloneable {

    private static DBSingleton dbSingleton = new DBSingleton();

    private DBSingleton() { }

    public static DBSingleton getInstance() {
        return dbSingleton;
    }
}



/*** This is eager loading of singleton object
 * We can load the object lazily by initializing in get instance method.
 */