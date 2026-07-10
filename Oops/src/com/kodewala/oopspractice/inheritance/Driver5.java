package com.kodewala.oopspractice.inheritance;
class Account1
{
	public void openAccount(String someDetails)
	{
		System.out.println("open account");
	}
}

class NewSavingAccount extends Account1
{
	public void openAccount(String someDetails)
	{
		System.out.println("SavingAccount.open account....");
	}
}
class CurrentAccount extends Account1
{
	public void openAccount(String someDetails)
	{
		System.out.println("currentAccount.open account");
	}
}

class HybridAccount extends NewSavingAccount
{
	public void openAccount(String someDetails)
	{
		System.out.println("hybridAccount.openaccount...");
	}
}
public class Driver5 {
	
	public static void main(String[] args) {
		CurrentAccount curr = new CurrentAccount();
		curr.openAccount("current account account opened");
		
		NewSavingAccount sav = new NewSavingAccount();
		sav.openAccount("Saving account opened");
		
		HybridAccount hyb = new HybridAccount();
		hyb.openAccount("hybrid account opened..");
	}

}
