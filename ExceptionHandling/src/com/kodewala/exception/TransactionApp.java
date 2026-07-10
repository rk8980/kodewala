package com.kodewala.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TransactionApp {

	public static void main(String[] args) {
		
		BankTransactionSystem bankTransactionSystem = new BankTransactionSystem();
		String fileName = "C:\\Users\\USER\\eclipse-workspace\\Arrays\\ExceptionHandling\\src\\com\\kodewala\\exception\\transaction.txt";
		
		FileReader fr = null;
		 BufferedReader br = null;
		 
		 try
		 {
			 // opening file
			 
			 fr = new FileReader(fileName);
			 br = new BufferedReader(fr);
			 
			 String line;
			 
			 // reading file line by line
			 while((line = br.readLine()) != null)
			 {
				 try
				 {
					bankTransactionSystem.processTransaction(line);
				 }
				 catch(InsufficientBalanceException e)
				 {
					 System.out.println("InsufficientBalanceException :" + e.getMessage());
				 }
				 catch(InvalidEmailException1 e)
				 {
					 System.out.println("InvalidEmailException1 :" + e.getMessage());
				 }
			 }
		 }
		 // file handling
		 catch(IOException e)
		 {
			 System.out.println("File Handlinf Exception");
			 e.printStackTrace();
		 }
		 
		 // resource closing
		 
		 finally
		 {
			 try
			 {
				 if(br != null)
				 {
					 br.close();
				 }
				 
				 if (fr != null)
				 {
					 fr.close();
				 }
				 System.out.println("File closed Successfully");
				 
			 }
			 catch(IOException e)
			 {
				 System.out.println("Exception while closing File");
				 e.printStackTrace();
			 }
		 }

	}

}
