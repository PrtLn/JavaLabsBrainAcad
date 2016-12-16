package com.brainacad.lab_2_09_String_Processing.ex3;

/**
 * Lab Work 2-9-3
 Goal
    Getting a practical experience in
        Using methods of class String.
 Task
    Create new project called TestStrings3. Add package “com.brainacad.oop.teststring3”.
    Create a class Main with a main() method.
    Create static method: uniqueChars(String s), which must  take a String as argument and return an array of distinct (unique) chars (char[]) of the given string.
    In method main() add code to invoke uniqueChars() method and pass string: “Using methods of class String” as argument. Print result to console.
    Execute the program.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use methods of class String;

 Execute following steps:
    Student should create a new blank Java Project in IDE.
    Student should create Main class with static method and provide all necessary code in a method main()

 Evaluation	no special evaluation;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        System.out.println(uniqueChars("Using methods of class String"));
        System.out.println(uniqueChars("New String"));
    }

    static char[] uniqueChars(String s) {
        char[] charArr = s.toCharArray();
        return  charArr;
    }
}
