package com.java.design.liskov;

import java.util.ArrayList;

public class StackWithInheritance<T> extends ArrayList<T> {

    private int stackPointer = 0;

    public void push(T item) {
        add(stackPointer++, item);
    }

    public T pop() {
        return remove(--stackPointer);
    }


    public static void main(String[] args) {
        StackWithInheritance<String> myStack = new StackWithInheritance<>();
        myStack.push("Kadale");
        myStack.clear();
        String lName = myStack.pop();

        System.out.println(lName);
    }
}

/**** Liskov substitution principal says - Super class instance and child class instance should be used interchangeably.
 * Here the principal violets. We can not use Stack Object as Array List.
 *
 * We can not implement few methods of Array List like addFirst() which is not applicable for Stack.
 */
