package com.kodewala.exceptionspractice;


class InvalidAgeException extends RuntimeException
{
	InvalidAgeException(String message)
	{
		super(message);
	}
}

public class Driver9
{
	public static void checkAge(int age)
	{
		if(age < 18)
		{
			throw new InvalidAgeException("Age cannot be less than 18");
		}
		
		System.out.println("Eligible");
	}

	public static void main(String[] args)
	{
		try
		{
			if(args.length == 0)
			{
				System.out.println("Please provide age");
				return;
			}

			int age = Integer.parseInt(args[0]);

			checkAge(age);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please enter valid number");
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}