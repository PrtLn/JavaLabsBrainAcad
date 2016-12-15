package com.brainacad.lab_2_08_AbstractClassesAndInterfaces.ex4;

class Rectangle extends Shape implements Comparable {

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

    @Override
    public int compareTo(Object o) {
        Rectangle rect = (Rectangle) o;
        if (this.area > rect.area)return 1;
        if (this.area < rect.area)return -1;
        return 0;
    }
}
