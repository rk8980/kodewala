package com.kodewala.exception;

public class FinallyBlockPractice {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try
		{
			int result = a / b;
			System.out.println("Result" + result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divided by zero");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally block executed ");
		}

	}

}
