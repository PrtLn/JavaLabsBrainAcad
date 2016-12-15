package com.brainacad.lab_2_07_InheritanceAndPolymorphism.ex10;

public class Shape {

    protected String shapeColor;
    protected double area;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Shape color is: " + shapeColor +
                ", and Shape area is: " + area + '\n';
    }
}
