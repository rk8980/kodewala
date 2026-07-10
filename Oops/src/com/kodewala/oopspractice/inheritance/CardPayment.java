package com.kodewala.oopspractice.inheritance;

public class CardPayment extends Payment1 
{
	private String cardNumber;

	public CardPayment(double amount, String cardNumber) {
		super(amount);
		this.cardNumber = cardNumber;
	}
	
	public void doCardPayment()
	{
		connectToBank();
		System.out.println("process card payment using "+ cardNumber);
		sendConfirmation();
	}
}
