package com.kodewala.exception;

public class BankTransactionSystem {
	//  method to process transaction
	
	public void processTransaction(String data) throws InsufficientBalanceException, InvalidEmailException1
	{
		try
		{
			// split data 
			String[] transaction = data.split(",");
			
			int accountNumber = Integer.parseInt(transaction[0]);
			
			String name = transaction[1];
			
			// Balance validation
			
			double balance = Double.parseDouble(transaction[2]);
			
			double withdrawAmount = Double.parseDouble(transaction[3]);
			
			String email = transaction[4];
			
			// insufficient balance check
			if(withdrawAmount > balance)
			{
				throw new InsufficientBalanceException("Insufficient Balance");
				
			}
			
			// email validation
			
			if(!email.contains("@"))
			{
				throw new InvalidEmailException1("Invalid email Format");
				
			}
			// Remaining balance
			double remainingBalance = balance - withdrawAmount;
			
			// Success message
			System.out.println("Transaction successfull");
			
			System.out.println("Account Number : " + accountNumber);
			System.out.println("Customer Name : " + name);
			System.out.println("Available Balance : " + balance);
			System.out.println("Withdraw Amount : " + withdrawAmount);
			System.out.println("Remaining Balance : " + remainingBalance);
			System.out.println("Customer Email : " + email);
			System.out.println("-----------------------------------------------");
			
			
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException Occurred");
			e.printStackTrace();
		}
	}
}
