package com.brainacad.lab_2_08_AbstractClassesAndInterfaces.ex2;

abstract class Shape implements Drawable {

    protected String shapeColor;
    protected double area;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Shape color is: " + shapeColor +
                ", and Shape area is: " + area + '\n';
    }
}
