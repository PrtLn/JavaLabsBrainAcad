package com.brainacad.lab_2_01_ClassAndInterfaces.lab_2_1_4;

/**
 * Created by L.Pikalova on 14.09.2016.
 * Lab Work 2-1-4
 Goal
    Getting a practical experience in
    •	Writing simple console application, using loop and getters/setters
 Task
    Write a program, that iterate through array of Computer objects and increases by 10 percent field price.

 Preparation	No special preparation

 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    •	how to use loop with array objects
    •	how to use getters/setters
    Execute following steps:
    •	Student should create a new blank Java Project in IDE.
    •	Student should create his or her own Java class and provide all necessary code in a method main()
    Ask student to execute the program

 Evaluation 	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class IncreasePrice {

    private float price;

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }


    public static void main(String[] args) {

        IncreasePrice[] comps = new IncreasePrice[5];

        System.out.print("Initial price of each computers: ");

        for (int i = 0; i < comps.length; i++) {
            IncreasePrice comp = new IncreasePrice();
                System.out.print(comp.getPrice() + ", ");
            comp.setPrice(10);
            comps[i] = comp;
        }
        System.out.println("before set price to 10 $");
        System.out.println();

        for (int i = 0; i < comps.length; i++) {
            IncreasePrice comp = comps[i];
            System.out.print("Get price of Computer " + (i + 1) + " is " + comp.getPrice() + ", ");
            comp.setPrice(comp.getPrice() * 1.1F);
            System.out.println("Set price of Computer increases to 10% " + i + " is " + comp.getPrice());
        }
    }
}
