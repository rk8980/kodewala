package com.kodewala.oopspractice.inheritance;

public class PaymentApp {

	public static void main(String[] args) {
		UPIPayment p1 = new UPIPayment(1000, "rahul@upi");
		
		CardPayment p2 = new CardPayment(3000, "234565432");
		
		p1.doPayment();
		System.out.println("---------------------------------------------------------------------");
		p2.doCardPayment();
	}

}
