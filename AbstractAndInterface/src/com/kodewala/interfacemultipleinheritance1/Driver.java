package com.kodewala.interfacemultipleinheritance1;


interface IPayment1
{
	int doPayment(int amount);
}
public class Driver {

	public static void main(String[] args) {
		
		IPayment1 p = (amount) -> amount;
		int result = p.doPayment(500);
		System.out.println("payment done "  +result);
	}

}


