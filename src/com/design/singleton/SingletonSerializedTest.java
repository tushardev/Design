package com.design.singleton;

import java.io.*;

public class SingletonSerializedTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SingletonSerialized instanceOne = SingletonSerialized.getInstance();

        /* Serialize Singleton Class */
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        /* Deserialize Singleton Class */
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SingletonSerialized instanceTwo = (SingletonSerialized) in.readObject();
        in.close();

        System.out.println(instanceOne);
        System.out.println(instanceTwo);

    }
}

/*****
 * Here we have serialized and deserialized singleton class. It created two instances.
 *
 * Test this class with adding and removing readResolve() method in SingletonSerialized class.
 *
 *
 */
