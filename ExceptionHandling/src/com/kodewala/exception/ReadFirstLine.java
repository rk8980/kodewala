package com.kodewala.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstLine {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try
		{
			// file path
			String fileName = "C:\\Users\\USER\\eclipse-workspace\\Arrays\\ExceptionHandling\\abc.txt";
			
			// open file
			br = new BufferedReader(new FileReader(fileName));
			
			String firstLine = br.readLine();
			
			// print the first line
			System.out.println("First Line: "+ firstLine);
			
		}
		catch(IOException e)
		{
			// handled exception
			System.out.println("Exception Handled ");
			e.printStackTrace();
		}
		finally {
			// close resource
			try
			{
				if(br != null)
				{
					br.close();
					System.out.println("BufferReader closed");
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
