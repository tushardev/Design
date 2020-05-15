package com.java.design.delegation;

import java.awt.*;

public abstract class Shape {

    protected Color color;

    public void darken() {
        System.out.println("Darken the shape");
    }

    public void draw(Graphics graphics) {
        graphics.setColor(color);
        render(graphics);
    }

    public abstract void render(Graphics g);
}

class Circle extends Shape {

    private Point center;
    private int radius;

    @Override
    public void render(Graphics g) {
        System.out.println("Call Render on Subclass");
    }
}


/**** Here we have implemented draw method in Super class itself where we pass the Graphics object.
 * Child class can set any properties of the Graphics instance and that will be used by super class to draw
 * the shape.
 *
 * Draw method then calls the render method which has been implemented by child class.  ***/
