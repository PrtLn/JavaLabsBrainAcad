package com.brainacad.lab_2_07_Inheritance_and_Polymorphism.ex9;

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
        double prmtr = (a + b + c) / 2;
        area = Math.sqrt(prmtr * (prmtr - a) * (prmtr - b) * (prmtr - c));
        return area;
    }

    @Override
    public String toString() {
        return "This is Triangle, color: " + shapeColor +
                ", a = " + a + ", b = " + b + ", c = " + c;
    }
}
