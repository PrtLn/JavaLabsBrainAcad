package com.brainacad.lab_2_03_Constructors.lab_2_3_3;

/**
 * Created by L.Pikalova on 9/18/2016.
 * Lab Work 2-3-3
 Goal
    Getting a practical experience in
        Design constructors that provide better user interface
        and at the same time assure the integrity of the data that the instances of the class represent
 Task
    Add to class Window overload constructors, which will initialize class’ fields,
        depend from what data we will put there:
            MyWindow(width, height),
            MyWindow(width, height, numberOfGlass).
    Finally class MyWindow must have four constructors)

 Preparation	No special preparation

 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to create overload constructors
     Execute following steps:
        Student should create two overloaded  constructors

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class MyWindow {

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return "width: " + width +
                ", hight: " + height +
                ", number of glass: " + numberOfGlass +
                ", color: " + color +
                ", window is open: " + isOpen;
    }

    public static void main(String[] args) {

        MyWindow window1 = new MyWindow(2.00, 1.00);
        System.out.println("Window 1 have width : " + window1.width + ", height: " + window1.height);

        MyWindow window2 = new MyWindow(3.00, 2.00, 2);
        System.out.println("Window 2 have width : " + window2.width + ", height: " + window2.height +
                            ", number of glass: " + window2.numberOfGlass);

        MyWindow window3 = new MyWindow(1.00, 2.00, 1, "white");
        System.out.println("Window 2 have width : " + window3.width + ", height: " + window3.height +
                            ", number of glass: " + window3.numberOfGlass + ", color: " + window3.color);

        MyWindow window4 = new MyWindow(3.00, 1.00, 3, "blue", true);
        System.out.println("Window 4 have " + window4);
    }
}
