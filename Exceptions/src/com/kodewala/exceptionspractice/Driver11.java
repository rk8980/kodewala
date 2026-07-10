package com.kodewala.exceptionspractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Driver11 {

	public static void main(String[] args)  {
		System.out.println("Driver11.main()");
		
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\USER\\eclipse-workspace\\Arrays\\Exceptions\\src\\com\\kodewala\\exceptionspractice\\Test.txt"));)
		
		{
			String line;
			
			
			
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
			String firstLine = br.readLine();
			System.out.println("First Line is : " + firstLine);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
			e.printStackTrace();
		}

	}

}


//package com.company.exceptions;
//
//public class InvalidAgeException extends Exception
//{
//    public InvalidAgeException(String message)
//    {
//        super(message);
//    }
//}
//
//
//package com.company.exceptions;
//
//public class AgeValidator
//{
//    public static void checkAge(int age) throws InvalidAgeException
//    {
//        if(age < 18)
//        {
//            throw new InvalidAgeException("Age must be 18 or above");
//        }
//
//        System.out.println("Eligible to vote");
//    }
//}
//
//package com.company.exceptions;
//
//public class Driver
//{
//    public static void main(String[] args)
//    {
//        try
//        {
//            AgeValidator.checkAge(15);
//        }
//        catch(InvalidAgeException e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
//}
//
//
