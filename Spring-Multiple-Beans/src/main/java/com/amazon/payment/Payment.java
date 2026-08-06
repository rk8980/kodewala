package com.amazon.payment;

public class Payment {
	
	private String refID;

	public Payment(String refID) {
		super();
		this.refID = refID;
	}
	
	public void pay()
	{
		System.out.println("Payment.pay()......" + refID);
	}

}
