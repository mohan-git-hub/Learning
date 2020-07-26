package com.home.oops;

public abstract class AbstractClass {

	int a = 10;
	int b = 20;
	
	AbstractClass(){
		System.out.println("Priting Constructor");
	}
	
	public abstract void FindValue() ;
	
	public void HighValue() {
		System.out.println("High Value");
	}	
}
