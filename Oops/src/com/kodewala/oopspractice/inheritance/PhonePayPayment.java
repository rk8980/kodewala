package com.kodewala.oopspractice.inheritance;

public class PhonePayPayment extends Payment 
{
	public PhonePayPayment(double amount) 
	{
		super(amount);	
	}

	public void makePayment() {
		// TODO Auto-generated method stub
		pay();
		 System.out.println("Processing PhonePe payment of Rs. " + getAmount());
		 
	        sendConfirmation();
	}
}
