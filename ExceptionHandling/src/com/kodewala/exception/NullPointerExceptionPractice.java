package com.kodewala.exception;

public class NullPointerExceptionPractice {

	public static void main(String[] args) {
		String str = null;
		
		try 
		{
			// calling method on null reference 
			int length = str.length();
			System.out.println("length" + length);
		}
		catch (NullPointerException e)
		{
			System.out.println("String is null");
			e.printStackTrace();
		}

	}

}
