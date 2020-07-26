package com.home.oops;

public class InheritAbstract extends AbstractClass{

	public void FindValue() {
		System.out.println("Over Ride Abstract Method of Parent Class");
	}
	
	public static void main(String[] args) {
		AbstractClass AC = new InheritAbstract();
		AC.FindValue();
		AC.HighValue();
	}
}
