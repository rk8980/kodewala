package com.kodewala.oopspractice.inheritance;
public class UPIPayment extends Payment1
{
	private String upiID;

	public UPIPayment(double amount, String upiID) {
		super(amount);
		this.upiID = upiID;
	}
	
	public void doPayment()
	{
		connectToBank();
		System.out.println("process upi payment using : "+ upiID);
		sendConfirmation();
	}
}
