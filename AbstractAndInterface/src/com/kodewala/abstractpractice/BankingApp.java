package com.kodewala.abstractpractice;

abstract class Loan
{
	protected double amount;
	
	public Loan(double amount)
	{
		
		this.amount = amount;
	}
	public abstract double calculateIntrest();
	
	// common method 
	
	public void approveLoan()
	{
		
		System.out.println("Loan approved for amount " + amount);
	}
}

class HomeLoan extends Loan
{
	public HomeLoan(double amount)
	{
		super(amount);
	}
	
	public double calculateIntrest()
	{
		return amount * 0.8;
	}
}
class CarLoan extends Loan
{
	public CarLoan(double amount)
	{
		super(amount);
	}
	public double calculateIntrest()
	{
		return amount * 0.10;
	}
}
public class BankingApp {

	public static void main(String[] args) {
		Loan l1 = new HomeLoan(500000);
		l1.calculateIntrest();
		System.out.println("Intrest for home loan is = " + l1.calculateIntrest());
		l1.approveLoan();
		
		System.out.println();
		System.out.println("-------------");
		
		Loan l2 = new CarLoan(300000);
		l2.calculateIntrest();
		System.out.println("Intrest for home loan is = " + l2.calculateIntrest());

		l2.approveLoan();

	}

}
