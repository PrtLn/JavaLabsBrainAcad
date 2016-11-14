package com.brainacad.lab_2_03_Constructors.lab_2_3_2;

/**
 * Created by L.Pikalova on 9/18/2016.
 * Lab Work 2-3-2
 Goal
    Getting a practical experience in
        Design constructors without parameters.
 Task
    Add to class MyWindow constructor without parameters,
        which will initialize class’s fields by some default values.
    Create instance of class MyWindow using constructor without parameters.

 Preparation	No special preparation

 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to create constructor
    Execute following steps:
        Student should add constructor without parameters to class MyWindow.
        Student should provide all necessary code in a constructor without parameters.

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

    public MyWindow() {
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

        MyWindow window = new MyWindow();

        System.out.println("Window have " + window);
    }
}
