package com.kodewala.oopspractice.polymorphism;

class Payment {

    public void pay(double amount) {
        System.out.println("Processing generic payment of ₹" + amount);
    }
}
class CreditCardPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Validating Credit Card...");
        System.out.println("Processing Credit Card payment of ₹" + amount);
        System.out.println("Payment Successful via Credit Card\n");
    }
}

class UPIPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Connecting to UPI server...");
        System.out.println("Processing UPI payment of ₹" + amount);
        System.out.println("Payment Successful via UPI\n");
    }
}


class NetBankingPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Redirecting to Bank...");
        System.out.println("Processing Net Banking payment of ₹" + amount);
        System.out.println("Payment Successful via Net Banking\n");
    }
}

class PaymentService {

    public void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }
}
public class PaymentApp {

    public static void main(String[] args) {

        PaymentService service = new PaymentService();

        Payment p;

        p = new CreditCardPayment();
        service.processPayment(p, 5000);

        p = new UPIPayment();
        service.processPayment(p, 2000);

        p = new NetBankingPayment();
        service.processPayment(p, 10000);
    }
}