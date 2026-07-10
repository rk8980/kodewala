package com.kodewala.oopspractice.inheritance;

public class CreditCardPay extends Payment
{

	public CreditCardPay(double amount) {
		super(amount);
	}
	public void makePayment()
	{
		pay();
		 System.out.println("Processing Credit Card payment of Rs. " + getAmount());
	        sendConfirmation();
	}
}
