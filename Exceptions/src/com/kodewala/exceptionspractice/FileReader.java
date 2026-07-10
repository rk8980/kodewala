package com.kodewala.exceptionspractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
	public void readFile()
	{
		String fileName = "C:\\Users\\USER\\eclipse-workspace\\Arrays\\Exceptions\\src\\com\\kodewala\\exceptionspractice\\Sales_Data.txt";
		try 
		{
			BufferedReader br = new BufferedReader(new java.io.FileReader(fileName));
			String line;
			
			while((line = br.readLine()) != null)
			{
				String lineArr[] = line.split(",");
				String city = lineArr[7];
				if (city.equals("Bangalore"))
				{
					System.out.println(line);
				}
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		{
			
		}
	}
	
	public static void main(String[] args) {
		FileReader fileReader = new FileReader();
		fileReader.readFile();
	}
}
