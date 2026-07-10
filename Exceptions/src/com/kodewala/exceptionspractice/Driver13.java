package com.kodewala.exceptionspractice;

public class Driver13 {

	public static void main(String[] args) {
		try
		{
			int[] arr = {10,20,30};
			String name = null;
			
			System.out.println(name.length());
			System.out.println(arr[5]);
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			
			System.out.println("NullPointerException Handled");
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}

	}

}
