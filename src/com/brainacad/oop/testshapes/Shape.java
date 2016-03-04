package com.brainacad.oop.testshapes;

import java.util.Objects;

public abstract class Shape implements Drawable {
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

    public abstract double calcArea();
}
