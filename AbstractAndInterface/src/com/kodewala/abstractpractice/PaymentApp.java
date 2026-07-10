package com.kodewala.abstractpractice;

abstract class Payment
{
	protected double amount;
	
	public Payment(double amount)
	{
		this.amount = amount;
	}
	
	public abstract void processPayment();
	
	// commom method 
	public void generateReceipt() {
		System.out.println("Payment.generateReceipt()"+amount);
	}
}

class creditCardPayment extends Payment
{

	public creditCardPayment(double amount) {
		super(amount);
		
	}
	@Override
	public void processPayment()
	{
		System.out.println("processing Credit card payment of "+ amount);
		System.out.println("connecting to bank");
	}
	
}

class UPIPayment1 extends Payment
{
	public UPIPayment1(double amount)
	{
		super(amount);
	}
	public void processPayment()
	{
		System.out.println("Processing UPI Payment of "+ amount);
		System.out.println("Verifying UPI ID...");
	}
	
}

class NetBankingPayment extends Payment
{
	public NetBankingPayment(double amount)
	{
		super(amount);
	}
	public void processPayment()
	{
		System.out.println("Processing NetBAnking Payment of "+ amount);
		System.out.println("Redirecting to bank portal...");
	}
}

public class PaymentApp {

	public static void main(String[] args) {
		Payment p1 = new creditCardPayment(5000);
		p1.processPayment();
		p1.generateReceipt();
		
		System.out.println();
		System.out.println("-------------------");
		
		Payment p2 = new UPIPayment1(2000);
		p2.processPayment();
		p2.generateReceipt();
		
		System.out.println();
		System.out.println("-------------------");
		
		Payment p3 = new NetBankingPayment(3000);
		p3.processPayment();
		p3.generateReceipt();

	}

}
/*
 interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class Card implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(1000);
    }
}
*/
