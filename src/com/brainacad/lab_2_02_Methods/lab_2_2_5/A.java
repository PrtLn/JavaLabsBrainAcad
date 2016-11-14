package com.brainacad.lab_2_02_Methods.lab_2_2_5;

public class A {

    private double a;
    private double b;
    private double r;
    private final double PI = 3.14;

    public double calcSquareRect(double a, double b) {
        return a * b;
    }
    public double calcSquareSquare(double a) {
        return a * a;
    }
    public double calcSquareCircle(double r) {
        return 2 * PI * r;
    }

    /* wrong
    public void calcSquareCircle(double r) {
        double sumCircle = 2 * PI * r;
    }*/

    @Override
    public String toString() {
        return "A {" +
                "a=" + a +
                ", b=" + b +
                ", r=" + r +
                ", PI=" + PI +
                '}';
    }
}
