package com.brainacad.oop.testshapes;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        double area = Math.PI*(Math.pow(radius, 2));
        return area;
    }

    @Override
    public String toString() {
        return "This is Circle, color: " + getShapeColor() +
                ", radius = "+radius;
    }
}
