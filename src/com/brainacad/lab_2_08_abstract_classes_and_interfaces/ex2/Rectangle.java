package com.brainacad.lab_2_08_Abstract_Classes_and_Interfaces.ex2;

class Rectangle extends Shape {

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
    public void draw() {
        System.out.println("This is Rectangle, color: " + shapeColor +
                ", width = " + width + ", height = " + height +
                ", area is " + calcArea());
    }
}
