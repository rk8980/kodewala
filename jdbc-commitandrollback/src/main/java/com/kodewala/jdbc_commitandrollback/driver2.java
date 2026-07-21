package com.kodewala.jdbc_commitandrollback;

public class driver2 {

	public static void main(String[] args) {
		BankTransfer bankTransfer = new BankTransfer();
		bankTransfer.doBankTransfer(5000,2);

	}

}
