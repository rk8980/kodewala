package com.kodewala.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try
		{
			String fileName = "C:\\Users\\USER\\eclipse-workspace\\Arrays\\ExceptionHandling\\abc.txt";
			br = new BufferedReader(new FileReader(fileName));
			// read the first line
			String line = br.readLine();
			
			System.out.println(br);
			
			System.out.println("first line: " + line);
		}
		catch(IOException e)
		{
			System.out.println("IOException handled");
			e.printStackTrace();
		}
		finally
		{
			// close resource properly
			try
			{
				if (br != null)
				{
					br.close();
					
					System.out.println("BufferREader closed");
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
