package com.brainacad.oop.testshapes;

public class Rectangle extends Shape implements Comparable {
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        double area = width*height;
        return area;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color: "+getShapeColor()+", width = "+width+
                ", height = "+height;
    }

    @Override
    public void draw() {
        System.out.println(toString()+", area is: "+calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle) o;
        if(this.calcArea()>rectangle.calcArea())return 1;
        if(this.calcArea()<rectangle.calcArea())return -1;
        return 0;
    }
}
