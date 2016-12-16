package com.brainacad.lab_2_09_String_Processing.ex2;

/**
 * Lab Work 2-9-2
 Goal
    Getting a practical experience in
        Using methods of class String.
 Task
    Create new project called TestStrings2. Add package “com.brainacad.oop.teststring2”.
    Create a class Main with a main() method.
        In method main() declare two local variables myStr1 and myStr2 of String type and assign a value “Cartoon” for first string and ”Tomcat” for second.
    Write code to display all of the letters, which are present in the first word, but absent in the second.

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

        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        //1
        /*for (char source : myStr1.toCharArray()) {
            boolean flag = false;
            for (char target : myStr2.toCharArray()) {
                if (source == target) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(source);
            }
        }*/

        // 2
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < myStr1.length(); i++){
            if (myStr2.indexOf(myStr1.charAt(i)) == -1) {
                strBuilder.append(myStr1.charAt(i));
            }
        }
        System.out.println(strBuilder);
    }
}
