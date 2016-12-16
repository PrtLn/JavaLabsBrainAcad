package com.brainacad.lab_2_07_Inheritance_and_Polymorphism.ex10;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String shapeColor, double wdth, double hght) {
        super(shapeColor);
        this.width = wdth;
        this.height = hght;
    }

    @Override
    public double calcArea() {
        return area = width * height;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color: " + shapeColor +
                ", width = " + width + ", height = " + height;
    }
}
