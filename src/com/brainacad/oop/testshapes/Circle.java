package com.brainacad.oop.testshapes;

public class Circle extends Shape implements Comparable {
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

    @Override
    public void draw() {
        System.out.println(toString()+", area is: "+calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle)o;
        if(this.calcArea()>circle.calcArea())return 1;
        if(this.calcArea()<circle.calcArea())return -1;
        return 0;
    }
}
