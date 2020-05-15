package com.java.design.liskov;

import java.util.ArrayList;

public class StackWithComposition<T> {

    private ArrayList<T> contents = new ArrayList<>();
    private int stackPointer = 0;

    public void push(T item) {
        contents.add(stackPointer++, item);
    }

    public T pop() {
        return contents.remove(--stackPointer);
    }

    public static void main(String[] args) {
        StackWithComposition<String> myStack = new StackWithComposition<>();
        myStack.push("Kadale");
        String lName = myStack.pop();

        System.out.println(lName);
    }
}

/*** The Stack class with Inheritance violets Liskov principal.
 Here we have used composition to fix the problem **/