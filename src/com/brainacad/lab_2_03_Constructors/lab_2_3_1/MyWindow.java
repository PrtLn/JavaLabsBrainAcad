package com.brainacad.lab_2_03_Constructors.lab_2_3_1;

/**
 * Created by L.Pikalova on 9/18/2016.
 *Lab Work 2-3-1
 Goal
    Getting a practical experience in
        Design constructors that provide better user interface
        and at the same time assure the integrity of the data that the instances of the class represent

 Task
    Create class “MyWindow” with fields (width (of double type), height (of double type),
      numberOfGlass(of int type), color(of  String type), isOpen(boolean)).
    Create five instances of class MyWindow,  with different  fields values.

 Preparation	No special preparation

 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to create class with fields and constructor;
    Execute following steps:
        Student should create a new blank Java Project in IDE.
        Student should create his or her own Java class and provide all necessary code in a method main()
        Student should create his or her own Java class with fields and constructor.

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 */

public class MyWindow {

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

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
                " meter, hight: " + height +
                " meter, number of glass: " + numberOfGlass +
                " picks, color: " + color +
                ", window is open: " + isOpen;
    }

    public static void main(String[] args) {

        MyWindow window1 = new MyWindow(1.00, 1.50, 2, "white", true);
        MyWindow window2 = new MyWindow(0.50, 1.50, 1, "yellow", true);
        MyWindow window3 = new MyWindow(2.00, 1.50, 2, "blue", false);
        MyWindow window4 = new MyWindow(2.50, 1.70, 1, "green", true);
        MyWindow window5 = new MyWindow(3.00, 1.50, 2, "gray", false);

        System.out.println("Window 1 have " + window1);
        System.out.println("Window 2 have " + window2);
        System.out.println("Window 3 have " + window3);
        System.out.println("Window 4 have " + window4);
        System.out.println("Window 5 have " + window5);
    }
}
