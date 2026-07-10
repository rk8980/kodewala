package com.kodewala.oopspractice.encap;

public class Account {
	private int balance = 1000;
	
	// setter 
	public void deposit(int _amount)
	{
		if(_amount > 0)
		{
			balance = balance + _amount;
			//System.out.println(balance);
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	
	public void withdraw(int _amount)
	{
		if(_amount > 0)
		{
		balance = balance - _amount;
		System.out.println("amount to be withdrawan : "+_amount);
		System.out.println("After withdrawn :  "+balance);
		}
		else
		{
			System.out.println("Insuffiecient balance");
		}
	}
	public int getBalance()
	{
		return balance;
	}
}
