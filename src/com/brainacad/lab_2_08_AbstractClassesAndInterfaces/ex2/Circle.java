package com.brainacad.lab_2_08_AbstractClassesAndInterfaces.ex2;

class Circle extends Shape {

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
    public void draw() {
        System.out.println("This is Circle, color: " + shapeColor +
                ", radius = " + radius +
                ", area is " + calcArea());
    }
}
