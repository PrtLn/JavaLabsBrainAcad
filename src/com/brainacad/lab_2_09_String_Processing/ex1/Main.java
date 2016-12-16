package com.brainacad.lab_2_09_String_Processing.ex1;

/**
 * Lab Work 2-9-1
 Goal
    Getting a practical experience in
        Using methods of class String.
 Task
    Create new project called TestStrings1. Add package “com.brainacad.oop.teststring1”.
    Create a class Main with a main() method.In method main() declare local variable myStr of String type and assign a value: “abracadabra”.
    Using the methods of the class String, do next steps:
        - Find the index of first “ra” substring  of myStr value and print result to console.
        - Find the index of last “ra” substring of myStr value and print result to console.
        - Get substring of myStr from 3 to 7 char index and print result to console.
    Create static method reverseString(String) which return String value as result with changed order of letters (reverse it, for example “abcd” ->”dcba”).
    Invoke reverseString() method with myStr argument and print result to console.
    Execute the program.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use methods of class String;

 Execute following steps:
    Student should create a new blank Java Project in IDE.
    Student should create class Main and provide all necessary code in a method main()

 Evaluation	no special evaluation;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        String myStr = "abracadabra";

        System.out.println("String - " + myStr);
        System.out.println("index of first “ra” - " + myStr.indexOf("ra"));
        System.out.println("index of last “ra” - " + myStr.lastIndexOf("ra"));
        System.out.println("substring from 3 to 7 char index - " + myStr.substring(3,7));
        System.out.println();

        String myStr2 = "foo boo foo";
        System.out.println("Direct string - " + myStr2);
        System.out.println("Reverse string - " + reverseString(myStr2));
    }

    static String reverseString(String str) {

        char[] a = str.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(a.length - 1) - i] = a[i];
        }
        return new String(b);

        //String s= new StringBuffer(str).reverse().toString();
        //return s;
    }
}
