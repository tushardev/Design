package com.design.structural.bridge.shape2;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    public void applyColor() {
        System.out.println("This is square");
        color.applyColor();
    }
}
