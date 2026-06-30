package com.kodewala.emp;

class Human extends Object {

	public Human(String name) {
		super();
	}

	public Human() {

	}
}

public class Student extends Human {

	String firstName;
	String lastName;

	public Student() {
		super();
	}

	Student(String _firstName) {
		this(_firstName, "."); // calling same class constructor
	}

	Student(String _firstName, String _lastName) {
		super("kodewala");
		this.firstName = _firstName;
		this.lastName=_lastName;
		lastName = _lastName;
	}

	public static void main(String[] args) {
		Student student1 = new Student("Anish"); // User
		Student student2 = new Student("Santanu", "kumar");
		
		student1=null;
		
		
	}

}
