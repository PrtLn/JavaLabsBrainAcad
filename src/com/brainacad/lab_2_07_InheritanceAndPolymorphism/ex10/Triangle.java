package com.brainacad.lab_2_07_InheritanceAndPolymorphism.ex10;

public class Triangle extends Shape {

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
        area = (a + b + c) / 2;
        return Math.sqrt(area * (area - a) * (area - b) * (area - c));
    }

    @Override
    public String toString() {
        return "This is Triangle, color: " + shapeColor +
                ", a = " + a + ", b = " + b + ", c = " + c;
    }
}
