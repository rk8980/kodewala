package com.kodewala.abstractpractice;
abstract class PaymentSystem
{
	public abstract void pay(); // what ?
	
	public abstract void doKYC();
	public void stopCheque() // Non- abstract method 
	{
		System.out.println("PaymentSystem.stopCheque()");
	}
}

class HDFC extends PaymentSystem
{
	@Override
	public void pay()
	{
		System.out.println("HDFC.pay()"); // how
	}
	public void doKYC() {
		System.out.println("HDFC.doKYC()");
	}
}
public class Driver {

	public static void main(String[] args) {
//		HDFC hdfc = new HDFC();
//		hdfc.doKYC();
//		hdfc.pay();
		PaymentSystem p1 = new HDFC();
		p1.doKYC();
		p1.pay();
		//PaymentSystem p2 = new PaymentSystem();
	
	}

}
