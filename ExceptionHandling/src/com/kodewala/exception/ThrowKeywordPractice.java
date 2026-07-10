package com.kodewala.exception;

public class ThrowKeywordPractice {

	public static void main(String[] args) {
		int age = 16;
		
		try 
		{
			// check age 
			if (age < 18)
			{
				// manually thorw exception
				
				throw new ArithmeticException("Not Eligible");
			}
			System.out.println("Eligible for voting");
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
