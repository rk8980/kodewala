package com.kodewala.oopspractice.inheritance;

public class Main {

	public static void main(String[] args) 
	{
		
		PhonePayPayment p1 = new PhonePayPayment(1000);
		p1.makePayment();
		System.out.println("---------------------------------------------------------------");
		
		GPayPayment p2 = new GPayPayment(20000);
		p2.makePayment();
		
		System.out.println("---------------------------------------------------------------");
		
		CreditCardPay p3 = new CreditCardPay(3000);
		p3.makePayment();
		
		
		System.out.println("---------------------------------------------------------------");
		
		NetBankingPay p4 = new NetBankingPay(40000);
		p4.makePayment(); 

	}

}
