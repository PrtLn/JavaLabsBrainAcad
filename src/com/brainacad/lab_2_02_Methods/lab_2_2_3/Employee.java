package com.brainacad.lab_2_02_Methods.lab_2_2_3;

public class Employee {

    private String name;
    private double salary;

    public void calcSalary(double salaryArr[], String nameArr[]) {
        for (int i = 0; i < nameArr.length; i++) {
            name = nameArr[i];
            for (int j = 0; j < i + 1; j++) {
                salary = salaryArr[j];
            }
            System.out.println("Employee " + name + " has salary " + salary);
        }
    }
}

