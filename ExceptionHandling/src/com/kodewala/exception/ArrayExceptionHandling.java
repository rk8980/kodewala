package com.kodewala.exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		// Array of size 3
	
		int[] arr = {10,20,30};
		
		try
		{
			// invalid index access
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Array index");
			e.printStackTrace();
		}

	}

}
