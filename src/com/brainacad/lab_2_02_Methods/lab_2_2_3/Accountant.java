package com.brainacad.lab_2_02_Methods.lab_2_2_3;

/**
 * Created by L.Pikalova on 10/3/2016.
 * Lab Work 2-2-3
 Goal
    Getting a practical experience in
        Writing simple console application, using varargs
 Task
    Write class Employee with method calcSalary with argument name(String) and varargs salary(double…).
    This method should calc total salary of employee and print his name and total salary.
    Write class Accountant that will be create Employee instance and use his method with a different number of data.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to create new objects
        how to use methods
        how to use varargs

 Execute following steps:
    Student should create a new blank Java Project in IDE.
    Student should create his or her own Java class and provide all necessary code in a method main()
    Student should varargs
    Ask student to execute the program

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Accountant {

    public static void main(String[] args) {

        String[] nameArr  = {"Smith", "Tom", "Marie"};
        double[] salaryArr = {1000.0, 2000.0, 3000.0};

        Employee employee = new Employee();
        employee.calcSalary(salaryArr, nameArr);
    }
}
