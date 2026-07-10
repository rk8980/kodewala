package com.kodewala.exceptionspractice;

public class Driver6 {
	public static void main(String[] args) {
		String name = "";
		
		System.out.println(name.length()); // NPE -----> Unchecked / Runtime Exception
		
		
		// Checked Exception
		
		try
		{
			Class.forName("com.kodewala.exceptionspractice");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}