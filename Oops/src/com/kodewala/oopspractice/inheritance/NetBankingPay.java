package com.kodewala.oopspractice.inheritance;

public class NetBankingPay extends Payment 
{

	public NetBankingPay(double amount) {
		super(amount);
	}
	public void makePayment()
	{
		pay();
		System.out.println("Processing Net Banking payment :" +getAmount());
		sendConfirmation();
	}
	

}
