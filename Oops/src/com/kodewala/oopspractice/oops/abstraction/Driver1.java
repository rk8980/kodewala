package com.kodewala.oopspractice.oops.abstraction;

class Payment {

    public void makePayment(String type, double amount) {

        if (type.equals("UPI")) {
            upiPayment(amount);
        } else if (type.equals("CARD")) {
            cardPayment(amount);
        } else if (type.equals("WALLET")) {
            walletPayment(amount);
        } else {
            System.out.println("Invalid payment type");
        }
    }

    
    private void upiPayment(double amount) {
        System.out.println("Processing UPI payment of " + amount);
    }

    private void cardPayment(double amount) {
        System.out.println("Processing Card payment of " + amount);
    }

    private void walletPayment(double amount) {
        System.out.println("Processing Wallet payment of " + amount);
    }
}

public class Driver1 {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.makePayment("UPI", 1000);
        payment.makePayment("CARD", 2000);
        payment.makePayment("WALLET", 500);
    }
}





//abstract class Payment {
//
//    protected double amount;
//
//    public Payment(double amount) {
//        this.amount = amount;
//    }
//
//    // Abstract method (must be implemented by child classes)
//    public abstract void makePayment();
//
//    // Common method (shared by all)
//    public void paymentSuccess() {
//        System.out.println("Payment of " + amount + " successful!");
//    }
//}
//
//// UPI Payment
//class UPI extends Payment {
//
//    public UPI(double amount) {
//        super(amount);
//    }
//
//    @Override
//    public void makePayment() {
//        System.out.println("Processing UPI payment of " + amount);
//        paymentSuccess();
//    }
//}
//
//// Card Payment
//class Card extends Payment {
//
//    public Card(double amount) {
//        super(amount);
//    }
//
//    @Override
//    public void makePayment() {
//        System.out.println("Processing Card payment of " + amount);
//        paymentSuccess();
//    }
//}
//
//// Wallet Payment
//class Wallet extends Payment {
//
//    public Wallet(double amount) {
//        super(amount);
//    }
//
//    @Override
//    public void makePayment() {
//        System.out.println("Processing Wallet payment of " + amount);
//        paymentSuccess();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        Payment p1 = new UPI(1000);
//        Payment p2 = new Card(2000);
//        Payment p3 = new Wallet(500);
//
//        p1.makePayment();
//        p2.makePayment();
//        p3.makePayment();
//    }
//}