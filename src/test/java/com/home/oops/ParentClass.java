package com.home.oops;

// Inheritance can achieved using extends keyword
// One Class can inherit one class at a time
// Multiple inheritance not allowed in Java
// Multi Level inheritance possible in Java C->B->A

public class ParentClass {
	
	String Name = "Kumar";
	String Dept = "IT";
	int Age = 21;
	int a = 10;
	
	public ParentClass() {
		System.out.println("Parent Class Constructor executed");
	}
	
	public ParentClass(String Grade) {
		this();
		System.out.println("Parent Class Grade Constructor executed " + Grade);
	}

	public void DisplayStudentDetails() {
		System.out.println("The Name of the student is " + Name + " with Age " + Age + " and belongs to Department" + Dept);
	}
}
