package com.design.structural.bridge.shape1;

public class Shape1BridgeDemo {

    public static void main(String[] args) {

        Circle circle = new BlueCircle();
        Square square = new RedSquare();

        circle.applyColor();
        square.applyColor();

        /*** Added new classes for green colour **/
        Square greenSquare = new GreenSquare();
        greenSquare.applyColor();
    }
}

/*** Here we have Blue and Red - circle and square.
 But if we need Green color we need new share implementation ***/