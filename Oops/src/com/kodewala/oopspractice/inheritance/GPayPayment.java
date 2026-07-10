package com.kodewala.oopspractice.inheritance;

public class GPayPayment extends Payment 
{

	public GPayPayment(double amount) {
		super(amount);
	}
	
	public void makePayment() {
        pay();
        System.out.println("Processing GPay payment of Rs. " + getAmount());
        sendConfirmation();
    }
	

}
