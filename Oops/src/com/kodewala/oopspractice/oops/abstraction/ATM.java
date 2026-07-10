package com.kodewala.oopspractice.oops.abstraction;

class ATM1 {

    // Public method (visible to user)
    public void withdrawMoney(int amount) {
        authenticateUser();
        checkBalance(amount);
        dispenseCash(amount);
    }

    // Hidden methods (internal logic)
    private void authenticateUser() {
        System.out.println("User authenticated...");
    }

    private void checkBalance(int amount) {
        System.out.println("Checking balance for: " + amount);
    }

    private void dispenseCash(int amount) {
        System.out.println("Please collect your cash: " + amount);
    }
}

public class ATM {
    public static void main(String[] args) {
        ATM1 atm = new ATM1();
        atm.withdrawMoney(5000);
    }
}

