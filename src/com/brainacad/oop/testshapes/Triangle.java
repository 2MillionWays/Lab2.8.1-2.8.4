package com.brainacad.oop.testshapes;

public class Triangle extends Shape implements Comparable {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s = (a+b+c)/2;
        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        return area;
    }

    @Override
    public String toString() {
        return "This is Triangle, color: "+getShapeColor()+", a = "+a+
                ", b = "+b+", c = "+c;
    }

    @Override
    public void draw() {
        System.out.println(toString()+", area is: "+calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Triangle triangle = (Triangle) o;
        if(this.calcArea()>triangle.calcArea())return 1;
        if(this.calcArea()<triangle.calcArea())return -1;
        return 0;
    }
}
