/*
 1. Read File and Handle Exception
Question

Write a Java program to:

open a file using FileReader
handle FileNotFoundException
print "File Opened"
close the file using finally

 */


package com.kodewala.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
			
			fr = new FileReader("abc.txt");
			
			String line = br.readLine();
			System.out.println("File Opened ");
			
			System.out.println("The data inside the file is :"+ line);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		}

		finally {
			try {
				if (fr != null)
				{
					fr.close();
				}
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			System.out.println("File Closed");
		}
	}
	

}
