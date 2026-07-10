package com.kodewala.exception;

public class PrintStackTracePractice {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try 
		{
			// exception generation statement
			
			int result = a / b;
			
			System.out.println("Result" + result);
		}
		catch (ArithmeticException e)
		{
			System.out.println("cannot divided by zero");
			// print complete stack trace
			e.printStackTrace();
		}

	}

}
