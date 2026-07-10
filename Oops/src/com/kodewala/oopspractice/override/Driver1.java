package com.kodewala.oopspractice.override;
class PaymentSystem1
{
	GenericResponse doPayment(String accNo, int amount, String note)
	{
		System.out.println("PaymentSystem.dopayment()....");
		return new GenericResponse("default payment");
	}	
}

class UPI extends PaymentSystem1
{
	@Override
	protected UPIResponse doPayment(String accNo, int amount, String note)
	{
		System.out.println("UPI.dopayment...");
		return new UPIResponse("default payment", "400");
	}
}
public class Driver1 {
	

	public static void main(String[] args) {
		UPI upi = new UPI();
		upi.doPayment("12345", 5000, "bill");
	}

}
