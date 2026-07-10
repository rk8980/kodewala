/*
 Write a Java program to:

Open a file named "abc.txt" using BufferedReader
Handle FileNotFoundException if the file does not exist
Use a finally block to close the file resource
Handle IOException while closing the file
Print appropriate messages during execution

 */

package com.kodewala.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test {

	public static void main(String[] args) {
		BufferedReader br = null;
		String fileName = "abc.txt";
		
		try {
			br = new BufferedReader(new FileReader(fileName));
			System.out.println("File opened");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		finally
		{
			try
			{
				if(br != null)
				{
					br.close();
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			System.out.println("Resources closed");
		}

	}

}
