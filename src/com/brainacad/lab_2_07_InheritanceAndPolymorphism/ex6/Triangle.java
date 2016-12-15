package com.brainacad.lab_2_07_InheritanceAndPolymorphism.ex6;

public class Triangle extends Shape {

    double area;
    double side;

    public Triangle(String shapeColor) {
        super(shapeColor);
    }

    public double calcArea(double side) {
        area = (Math.pow(side, 2) * Math.sqrt(3.0)) / 4;
        return area;
    }

    @Override
    public String toString() {
        return "Triangle color is: " + shapeColor +
                ", and Triangle side is: " + side;
    }
}
