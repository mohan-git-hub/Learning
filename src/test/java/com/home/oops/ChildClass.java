package com.home.oops;

public class ChildClass extends ParentClass{

	int b = 10;
	
	public ChildClass() {
		super("Raj");
		System.out.println("Executing Child Class Constuctor");
	}
	
	public ChildClass(int a) {
		this();
		System.out.println("Executing Child Class integer constructor " + a);
	}
		
	public void perform() {
		System.out.println("The product of Value is " + super.a * b);
		super.DisplayStudentDetails();
	}
	
	public static void main(String[] args) {
		new ChildClass().perform();
		ParentClass PC = new ParentClass();
		PC.DisplayStudentDetails();
	}
}