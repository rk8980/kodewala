package com.kodewala.exception;

public class MultipleCatchPractice {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		int[] arr = {10,20,30};
		
		try 
		{
			// division operation
			int result = a / b;
			System.out.println("Result" + result);
			
			// array access
			System.out.println(arr[5]);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Cannot divided by zero");
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Array index");
			e.printStackTrace();
		}
	}

}
