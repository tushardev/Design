package com.design.structural.bridge.shape2;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("This is circle");
        color.applyColor();
    }
}
