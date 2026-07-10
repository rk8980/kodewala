package com.kodewala.exceptionspractice;

public class Test {
	static int someValue;

	public static void main(String[] args) { // +ve -----> Happy scenario
		System.out.println("Thisis sample program- START");
		
		String amountStr = args[0];
		int amount = Integer.parseInt(amountStr); // "1a23" -----> NumberFormat Exception
		
		String name = args[1];
		
		int result = amount / someValue; // by zero --- > arithmetic exception
		
		System.out.println("Amount" + amount);
		System.out.println("length" + name.length()); // NullPointer Exceptions
		
		
		System.out.println("This is sampleprogramm - END");

	}

}
