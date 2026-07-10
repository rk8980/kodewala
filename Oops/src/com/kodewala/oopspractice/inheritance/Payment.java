package com.kodewala.oopspractice.inheritance;

public class Payment {
    protected Payment(double amount) {
        this.amount = amount;
    }
	  private double amount;

	    public double getAmount() {
	        return amount;
	    }
	    private void connectToBank() {
	        System.out.println("Connecting to bank...");
	    }
	    public void pay()
	    {
	    	connectToBank();
	    }

	    public void sendConfirmation() {
	        System.out.println("Payment successful! Confirmation sent to user.");
	    }

	}