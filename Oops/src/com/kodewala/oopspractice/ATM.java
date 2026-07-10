package com.kodewala.oopspractice;

import java.util.Scanner;

public class ATM 
{
	
	private double balance;
	private String pin;
	public ATM(double balance, String pin) // constructor  
	{
		this.balance = balance;
		this.pin = pin;
	}
	// method to withdraw
	public void withdraw(double amountToWithdraw, String enteredPin)
	{
		System.out.println("current balance is : "+balance);
		if(enteredPin.equals(pin) && amountToWithdraw <= balance)
		{
			balance = balance - amountToWithdraw;
			System.out.println("balance post withdraw " + balance);
		}
		else
		{
			System.out.println("Insufficient balance or incorrect pin");
		}
	}
	// method to deposit money
	public void deposit(double amountToDeposit, String enteredPin)
	{
		if(enteredPin.equals(pin))
		{
			balance = balance + amountToDeposit;
			System.out.println("deposit : "+amountToDeposit);
			
			System.out.println("After deposited new balance is : "+balance);
		}
		else
		{
			System.out.println(" Error incorrect pin");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the real amount in bank : ");
		double balance = sc.nextDouble();
		System.out.println("enter the pin : ");
		String pin = sc.next();
		ATM atm = new ATM(balance, pin);
		System.out.println("amount to be withdrawan : ");
		double amountToWithdraw = sc.nextDouble();
		atm.withdraw(amountToWithdraw, pin);
		
		System.out.println("amount to be deposit");
		double amountToDeposit = sc.nextDouble();
		atm.deposit(amountToDeposit, pin);

	}

}
