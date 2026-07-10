package com.kodewala.exceptionspractice;

public class Driver5 {

	public static void main(String[] args) {
		
		//int num = 10;
		String str = "null";
		try
		{
			//int number = num / 0;
			
			System.out.println(str.length());
			
			
		}
		catch(Exception e)
		{
			System.out.println("null exception handled ");
			e.printStackTrace();
			//System.out.println("cannot be dived by zero");
		}

	}

}
