package com.kodewala.exceptionspractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Driver8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		
		try
		{
			System.out.println("try start");
			br = new BufferedReader(new FileReader("C:\\\\Users\\\\USER\\\\eclipse-workspace\\\\Arrays\\\\ExceptionHandling\\\\abc.txt"));
			String name = args[0];
			//String line = br.readLine();
			
			//System.out.println(line);
			System.out.println("Driver.main().....try end");
			
			System.exit(0);
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("Name is not provided");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.err.println("something");
		}
		finally
		{
			br.close();
			System.out.println("finally block executed.");
		}

	}

}
