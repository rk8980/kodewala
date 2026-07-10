package com.kodewala.exceptionspractice;


class InvalidAgeException1 extends Exception
{
	InvalidAgeException1(String message)
	{
		super(message);
	}
}

public class Driver10
{
	public static void checkAge(int age) throws InvalidAgeException1
	{
		if(age < 18)
		{
			throw new InvalidAgeException("Age should be 18 or above");
		}
		
		System.out.println("Eligible for voting");
	}

	public static void main(String[] args) throws InvalidAgeException1
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