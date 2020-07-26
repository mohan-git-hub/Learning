package com.home.exception;

public class ExceptionLearning {
	
	public void processArray() {
		int[] intArr = {1,2,3,4,5};
		try {
		for(int i = 0;i<intArr.length;i++) {
			System.out.println("Process Start");
			System.out.println(intArr[i]/0);//Arithmetic Exception
			System.out.println("Process");
			System.out.println("Process1");
			System.out.println("Process2");
		}
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("DB Close  ");
		}
		System.out.println("Last Statement");
	}
	public static void main(String[] args) {
		new ExceptionLearning().processArray();
	}
	}



