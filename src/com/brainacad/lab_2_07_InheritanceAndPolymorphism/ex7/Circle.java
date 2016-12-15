package com.brainacad.lab_2_07_InheritanceAndPolymorphism.ex7;

public class Circle extends Shape {

    double area;
    double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public Circle(String shapeColor) {
        super(shapeColor);
    }

    public double calcArea() {
        area = Math.PI * (Math.pow(radius, 2));
        return area;
    }

    @Override
    public String toString() {
        return "This is Circle, color: " + shapeColor +
                ", radius = " + radius;
    }
}
