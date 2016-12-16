package com.brainacad.lab_2_09_String_Processing.ex4;

import java.util.StringTokenizer;

/**
 * Lab Work 2-9-4
 Goal
    Getting a practical experience in
        Using StringTokennizer class
 Task
    Create new project called TestTokennizer. Add package “com.brainacad.oop.teststokennizer”.
    Create a class Main with a main() method.
    In method main() declare local variables myStr add code which split a string by “space” “comma” and “.dot” delimiter
        using StringTokennizer  class, and iterate the StringTokenizer elements and print it out one by one to console.
    String myStr = “This is String, split by StringTokenizer. Created by Student:Name of Student”.
    Execute the program.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use StringTokennizer class

 Execute following steps:
     Student should create his or her own Java class and provide all necessary code in a method main()

 Evaluation	No special evaluation
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        String myStr= "This is String, split by StringTokenizer. Created by Student: Lena Pikalova";

        //String delimeter = ",\\ \\.";
        String delimeter = ":\\,";
        StringTokenizer str = new StringTokenizer(myStr, delimeter);
        while (str.hasMoreElements()) {
            System.out.println(str.nextElement());
        }
    }
}
