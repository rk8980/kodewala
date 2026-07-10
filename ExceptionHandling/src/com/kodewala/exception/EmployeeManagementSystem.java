package com.kodewala.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// custom exception for invalid age

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
// custom exception for invalid email

class InvalidEmailException extends Exception
{
	public InvalidEmailException(String message)
	{
		super(message);
	}
}
public class EmployeeManagementSystem {
	// method to process employee data 
	
	public static void processEmployee(String data) throws InvalidAgeException,InvalidEmailException
	{
		try
		{
			// split the data 
			
			String[] emp = data.split(",");
			
			int id = Integer.parseInt(emp[0]);
			String name = emp[1];
			
			int age = Integer.parseInt(emp[2]);
			
			// age validation
			
			if (age <= 18)
			{
				throw new InvalidAgeException("Age must be greater than 18");
			}
			// salary validation
			
			double salary = Double.parseDouble(emp[3]);
			
			String email = emp[4];
			
			//email validation
			if (!email.contains("@"))
			{
				throw new InvalidEmailException("Invalid email format");
				
			}
			// If everything is correct
			
			System.out.println("Employee Addedd Successfully");
			System.out.println("ID : " + id);
			System.out.println("Name : " + name);
			System.out.println("Salary : " + salary);
			System.out.println("Age : " + age);
			System.out.println("Email : " + email);
			System.out.println("---------------------------");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException Occurred");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String fileName = "employee.txt";
		
		FileReader fr = null;
		
		BufferedReader br = null;
		
		try
		{
			// opening file 
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String line;
			
			while((line = br.readLine()) != null)
			{
				try
				{
					processEmployee(line);
				}
				catch(InvalidAgeException e)
				{
					System.out.println("InvalidAgeException : "+ e.getMessage());
				}
				catch(InvalidEmailException e)
				{
					System.out.println("InvalidEmailException : "+ e.getMessage());
				}
				
			}
		}
		// file not found exception
		catch(IOException e)
		{
			System.out.println("File Handling exception");
			e.printStackTrace();
		}
		// finally block for resource closed
		finally
		{
			try
			{
				if(br != null)
				{
					br.close();
				}
				if(fr != null)
				{
					fr.close();
				}
				System.out.println("File closed Successfully");
			}
			catch(IOException e)
			{
				System.out.println("Exception while closinf File");
				e.printStackTrace();
			}
		}

	}

}
