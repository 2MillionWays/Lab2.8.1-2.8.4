package com.brainacad.oop.testshapes;

import java.util.Objects;

public class Shape {
    private String shapeColor;

    public String getShapeColor() {
        return shapeColor;
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "This is Shape, color is: " + shapeColor;
    }

    public double calcArea(){
        double area = 0.0;
        return area;
    }
}
