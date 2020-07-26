package com.home.dependencies;

import com.google.inject.Inject;

public class DependencyChild{

	
	DependencyParent dd;
	
	
	String text = "Child";
	public void displayChild() {
		System.out.println("Child Class " + text);
		dd.displayParent();
	}
	
	public static void main(String[] ar) {
		new DependencyChild().displayChild();
	}
	
}
