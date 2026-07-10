package com.kodewala.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileClosingException {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		
		try
		{
			// open file
			
			br = new BufferedReader(new FileReader("C:\\Users\\USER\\eclipse-workspace\\Arrays\\ExceptionHandling\\abc.txt"));
			
			System.out.println("File opened");
			
			// read first line
			String line = br.readLine();
			
			System.out.println("First line: "+ line);
			
		}
		catch(IOException e)
		{
			System.out.println("Exception while reading the file");
			e.printStackTrace();
		}
		finally
		{
			// closing the file
			try
			{
				if (br != null)
			{
				br.close();
					System.out.println("File closed successfully");
				}
			}
			catch(IOException e)
			{
				System.out.println("Exception while closing the file");
				e.printStackTrace();
			}
//			br.close();
//			System.out.println("File closed successfully");
		}

	}

}
