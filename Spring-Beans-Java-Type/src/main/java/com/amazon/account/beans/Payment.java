package com.amazon.account.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // payment class beans becomes spring managed bean.
public class Payment {
	
	@Value(value = "PAYREF123")
	private String paymentRef;

	public void showPayment()
	{
		System.out.println("Payment.showPayment().............." + paymentRef);
	}
}
