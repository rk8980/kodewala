package com.kodewala.interfacepractice2;
interface IBanking
{
	void pay();
	void settle();
	void cancelTxn();
	default void printPassbook() // only rural bank need this 
	{
		
		System.out.println("IBanking.printPassbook()");
	}
}
class HDFC implements IBanking
{

	@Override
	public void pay() {
		
		System.out.println("HDFC.pay()");
	}

	@Override
	public void settle() {
		System.out.println("HDFC.settle()");
		
	}

	@Override
	public void cancelTxn() {
		
		System.out.println("HDFC.cancelTxn()");
	}
	
}
class PNB implements IBanking
{

	@Override
	public void pay() {
		System.out.println("PNB.pay()");
		
	}

	@Override
	public void settle() {
		
		System.out.println("PNB.settle()");
	}

	@Override
	public void cancelTxn() {
		
		System.out.println("PNB.cancelTxn()");
	}
	
}

class RuralBank implements IBanking
{

	@Override
	public void pay() {
		System.out.println("RuralBank.pay()");
		
	}

	@Override
	public void settle() {
		
		System.out.println("RuralBank.settle()");
	}

	@Override
	public void cancelTxn() {
		System.out.println("RuralBank.cancelTxn()");
		
	}
	public void printPassbook()
	{
		System.out.println("RuralBank.printPassbook()");
	}
	
}
public class Main {

	public static void main(String[] args) {
		HDFC b1 = new HDFC();
		b1.pay();
		b1.settle();
		b1.cancelTxn();
		System.out.println();
		System.out.println("--------------");
		
		PNB b2 = new PNB();
		b2.pay();
		b2.settle();
		b2.cancelTxn();
		System.out.println();
		System.out.println("--------------");
		
		RuralBank b3 = new RuralBank();
		b3.pay();
		b3.settle();
		b3.cancelTxn();
		b3.printPassbook();
		System.out.println();
		System.out.println("--------------");
		
	}

}
