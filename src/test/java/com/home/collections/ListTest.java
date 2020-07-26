package com.home.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ListTest {
	
	public void processArrayList() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(23);
		l1.add(32);
		l1.add(34);
		l1.add(35);
		l1.add(40);
		l1.add(32);
		l1.remove(0);
		System.out.println("List Elements are " + l1);
		Iterator it1 = l1.iterator();
		
		for(int a:l1) {
			System.out.println(it1.next());
		}
	
	}
	public void processSet() {
		int[] arr = {24,12,13,56,12,62,78,15,14};
		Set<Integer> intSet = new TreeSet<Integer>();
		for(Integer i : arr) {
			if(intSet.add(i)) {
			}
			else
			{
				System.out.println("Duplicate values are " + i);
			}
		}
		System.out.println(intSet);
		
	
	}
public static void main(String[] args) {
	ListTest LT = new ListTest();
	LT.processArrayList();
	LT.processSet();
}
}
