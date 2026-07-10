package com.kodewala.oopspractice.inheritance;

public class Payment1 {
	private double amount;

	public Payment1(double amount) {
		this.amount = amount;
	}
	// getter 
	public double getAmount()
	{
		return amount;
	}
	
	// common method
	
	private void getConnectToBank()
	{
		System.out.println("connecting to bank");
	}
	
	
	private void getSendConfirmation()
	{
		System.out.println("payment of "+ amount + "Succesful");
	}
	
	private void processPayment()
	{
		System.out.println("processing payment");
	}
	
	
	
	public void connectToBank()
	{
		getConnectToBank();
	}

	public void sendConfirmation()
	{
		getSendConfirmation();
	}
	
	public void processingPayment()
	{
		processPayment();
	}
}
