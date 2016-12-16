package com.brainacad.lab_2_09_String_Processing.ex5;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Lab Work 2-9-5
 Goal
    Getting a practical experience in
        Using Matcher and Pattern classes.
 Task
    Create new project called TestRegExp. Add package “com.brainacad.oop.testsregexp”.
    Create a class Main with a main() method.
    Create public static method checkPersonWithRegExp(String userNameString) which take String as argument and return boolean value. This method must return true only if argument string value begin from Uppercase, then other chars in Lowercase and contains only letters.
    In main() method declare array of String with next values:
            {“VOVA”,”Ivan”,”R2d2”,”ZX”,”Anna”,”12345”,”ToAd”,”TomCat”,” “}
    Add code to check each of these values with checkPersonWithRegExp() method and print result to console.
    Execute the program.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use Matcher and Pattern classes

 Execute following steps:
    Student should create Main class with static method and provide all necessary code

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {

    public static boolean checkPersonWithRegExp(String str) {

        Pattern pattern = Pattern.compile("[A-Z]([a-z]+)");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    public static void main(String[] args) {

        String[] arrStrings = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};

        System.out.println(Arrays.toString(arrStrings));
        System.out.println("This method returns true if string value begin from Uppercase" +
                "\nor returns true if other chars in Lowercase and contains only letters: \n");

        for (String s : arrStrings) {
            System.out.println(s + " - " + checkPersonWithRegExp(s));
        }
    }
}
