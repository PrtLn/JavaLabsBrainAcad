package com.brainacad.lab_2_08_Abstract_Classes_and_Interfaces.ex2;

class Triangle extends Shape {

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
    public void draw() {
        System.out.println("This is Triangle, color: " + shapeColor +
                ", a = " + a + ", b = " + b + ", c = " + c +
                ", area is " + calcArea());
    }
}
