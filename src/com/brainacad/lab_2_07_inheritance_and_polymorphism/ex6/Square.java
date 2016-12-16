package com.brainacad.lab_2_07_Inheritance_and_Polymorphism.ex6;

public class Square extends Shape {

    double area;
    double side;

    public Square(String shapeColor) {
        super(shapeColor);
    }

    public double calcArea(double side) {
        area = side * side;
        return area;
    }

    @Override
    public String toString() {
        return "Square color is: " + shapeColor +
                ", and Square side is: " + side;
    }
}
