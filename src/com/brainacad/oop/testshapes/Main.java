package com.brainacad.oop.testshapes;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("Red");

        System.out.println(shape);
        System.out.println("Shape area is: "+shape.calcArea());

        Circle testCircle = new Circle("Blue", 10);

        System.out.println(testCircle);
        System.out.println("Circle area is: "+testCircle.calcArea());

        Rectangle testRect = new Rectangle("Black", 11, 22);

        System.out.println(testRect);
        System.out.println("Rectangle area is: "+testRect.calcArea());

        Triangle testTri = new Triangle("Orange", 5, 5, 5);

        System.out.println(testTri);
        System.out.println("Triangle area is: "+testTri.calcArea());

        Shape[] arr = {testCircle, new Circle("Blue", 3), testRect, new Rectangle("Brown", 5,8)
                ,testTri, new Triangle("Green", 3,4,5)};

        double sumArea = 0;
        double sumRectArea = 0;
        double sumCircleArea = 0;
        double sumTriangleArea = 0;

        for(Shape arrayElement : arr){
            System.out.println(arrayElement.toString() + ", area is: " + arrayElement.calcArea());
            sumArea+=arrayElement.calcArea();
            if(arrayElement instanceof Rectangle){
                sumRectArea+=arrayElement.calcArea();
            } if(arrayElement instanceof Circle){
                sumCircleArea+=arrayElement.calcArea();
            } if(arrayElement instanceof Triangle){
                sumTriangleArea+=arrayElement.calcArea();
            }
        }
        System.out.println("Total area of all shapes = "+sumArea);
        System.out.println("Rectangle total area: "+sumRectArea);
        System.out.println("Circle total area: "+sumCircleArea);
        System.out.println("Triangle total are: "+sumTriangleArea);

    }
}
