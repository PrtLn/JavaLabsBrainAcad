package com.brainacad.lab_2_01_ClassAndInterfaces.lab_2_1_3;

import java.util.Arrays;

/**
 * Created by L.Pikalova on 14.09.2016.
 * Lab Work 2-1-3
 Goal
 Getting a practical experience in
    •	Writing simple console application, using arrays of objects
 Task
    Write a program to create array of Computer objects (5 pcs.)
        Declare array of Computer objects (5 pcs.),
        create 5 Computer objects and place it to array (using loop).

 Preparation	No special preparation

 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    •	how to create new objects
    •	how to initialize and use arrays of objects
    •	how to use loops
    Execute following steps:
    •	Student should create a new blank Java Project in IDE.
    •	Student should create his or her own Java class and provide all necessary code in a method main()
    •	Student should use operator new.
    Ask student to execute the program

 Evaluation	•	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class ComputerManager {

    public static void main(String[] args) {

          // объявляем массив компьютеров длиной в 5 штук
        ComputerClient[] comps = new ComputerClient[5];

        System.out.print("Array of Computer objects consist from ");

        for (int i = 0; i < comps.length ; i++) {
            ComputerClient computer = new ComputerClient(i);
            comps[i] = computer;
        }
        System.out.println(Arrays.toString(comps));
    }
}

