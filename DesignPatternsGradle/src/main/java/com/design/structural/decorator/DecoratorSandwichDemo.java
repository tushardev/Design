package com.design.structural.decorator;

public class DecoratorSandwichDemo {

    public static void main(String[] args) {

        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());

        Sandwich musterdSandwich = new DressingDecorator(new SimpleSandwich());
        System.out.println(musterdSandwich.make());
    }
}
