package com.brainacad.lab_2_04_Static_Methods_and_Fields.lab_2_4_4;

/**
 * Created by L.Pikalova on 15.09.2016.
 * Lab Work 2-4-4
 Goal
    Getting a practical experience in
        Writing simple class with instance fields  and static(class) fields.
 Task
    Create Employee class with fields firstName, lastName, occupation, telephone and static field numberOfEmployees and getters/setters.
    Also class must have constructor, which will initialize class fields end increment numberOfEmployees.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    	how to create simple class
    	how to create static fields
    Execute following steps:
    	Student should create a new blank Java Project in IDE.
    	Student should create his or her own Java class with static field, instance field and methods.
    Ask student to execute the program

 Evaluation	No special evaluation
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Employee {

	private String firstName;
	private String lastName;
	private String occupation;
	private int telephone;

	private static int numberOfEmployees;

	// constructor for instance fields
	public void setEmployee(String firstName, String lastName, String occupation, int telephone){
		this.firstName = firstName;
		this.lastName = lastName;
		this.occupation = occupation;
		this.telephone = telephone;
	}

	// constructor for static field
	public Employee(String firstName, String lastName, String occupation, int telephone) {
		numberOfEmployees++;
	}

	public static int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getOccupation() {
		return occupation;
	}
	public int getTelephone() {
		return telephone;
	}

	@Override
	public String toString() {
		return "First name " + firstName +
				", Last Name " + lastName +
				", Occupation " + occupation +
				", Telephone number " + telephone;
	}

	public static void main(String[] args) {

		Employee employee1 = new Employee("A", "AA", "aa", 2222);
		Employee employee2 = new Employee("B", "BB", "bb", 3333);
		Employee employee3 = new Employee("C", "CC", "cc", 4444);
		Employee employee4 = new Employee("D", "DD", "dd", 5555);

		System.out.println("Number of Employees - " + Employee.getNumberOfEmployees());
    }
}
