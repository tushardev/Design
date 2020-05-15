package com.design.structural.bridge.shape2;

public class Shape2BridgeDemo {

    public static void main(String[] args) {

        Color blue = new Blue();

        Shape square = new Square(blue);

        Color red = new Red();

        Shape circle = new Circle(red);

        square.applyColor();
        circle.applyColor();

        /*** Added new color class and can be applied to any shape */
        Color green = new Green();

        Square greenSquare = new Square(green);
        greenSquare.applyColor();

        Circle greenCircle = new Circle(green);
        greenCircle.applyColor();
    }
}
