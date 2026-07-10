package com.kodewala.oopspractice.encap;

public class Driver {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(1200);
		account.getBalance();
		
		account.withdraw(500);
		
		System.out.println(account.getBalance());
	}

}
