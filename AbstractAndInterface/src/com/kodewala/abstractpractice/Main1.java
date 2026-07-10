package com.kodewala.abstractpractice;
abstract class Payment2
{
	protected double amount;
	
	public Payment2(double amount)
	{
		this.amount = amount;
	}
	public abstract void processPayment();
	
	// common method 
	public void commonValidation()
	{
		System.out.println("Validating payment of amount: "+ amount);
	}
}

class CreditCardPayment1 extends Payment2
{
	public CreditCardPayment1(double amount) {
	super(amount);
	}
	public void processPayment()
	{
		System.out.println("Paid " + amount + " using credit card");
	}
}

class UPIPayment extends Payment2
{
	public UPIPayment(double amount)
	{
		super(amount);
	}
	public void processPayment()
	{
		System.out.println("Paid " + amount + " using UPI");
	}
}

class WalletPayment extends Payment2
{

	public WalletPayment(double amount) {
		super(amount);
		
	}
	public void processPayment()
	{
		System.out.println("Paid " + amount + " using Wallet");
	}
	
}

class PaymentService
{
	public void makePayment(Payment2 payment)
	{
		payment.commonValidation(); // common logic
		payment.processPayment(); // runtime  Polymorphism
		
		System.out.println("Payment completed\n");
	}
}
class CryptoPayment extends Payment2
{

	public CryptoPayment(double amount) {
		super(amount);
		
	}
	public void processPayment()
	{
		System.out.println("Paid using Crypto");
	}
	
}
public class Main1 {

	public static void main(String[] args) {
		PaymentService service = new PaymentService();
		Payment2 p1 = new CreditCardPayment1(5000);
		Payment2 p2 = new UPIPayment(2000);
		Payment2 p3 = new WalletPayment(1000);
		Payment2 p4 = new CryptoPayment(3500);
		
		service.makePayment(p1);
		service.makePayment(p2);
		service.makePayment(p3);
		service.makePayment(p4);

	}

}


/*
 interface Notification {
    void sendNotification(String message);
}

class EmailNotification implements Notification {

    public void sendNotification(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

class SMSNotification implements Notification {

    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class PushNotification implements Notification {

    public void sendNotification(String message) {
        System.out.println("Sending PUSH Notification: " + message);
    }
}


class NotificationService {

    public void notifyUser(Notification notification, String message) {
        notification.sendNotification(message);
    }
}

public class Main {
    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        service.notifyUser(email, "Order Placed Successfully!");
        service.notifyUser(sms, "Your OTP is 1234");
    }
}
 */
