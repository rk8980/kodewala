package com.kodewala.interfacepractice2;


interface IOTTService
{
	// initial feature start
	public abstract void signUp();
	public abstract void login();
	public abstract void subscribe();
	void doWatch();
	public void cancelSubscription();
	
	
	// initial feautre end 
	
	public default void shorts30Sec()
	{
		System.out.println("IOTTService.shorts30Sec()");
	}
		
}
class MXPlayer implements IOTTService
{

	@Override
	public void signUp() {
		System.out.println("MXPlayer.signUp()");
		
	}

	@Override
	public void login() {
		System.out.println("MXPlayer.login()");
		
	}

	@Override
	public void subscribe() {
		System.out.println("MXPlayer.subscribe()");
		
	}

	@Override
	public void doWatch() {
		
	System.out.println("MXPlayer.doWatch()");
	}

	@Override
	public void cancelSubscription() {
		System.out.println("MXPlayer.cancelSubscription()");
		
	}
	
}
class Netflix implements IOTTService {
	public void signUp()
	{
		System.out.println("Netflix.signUp()");
	}
	public void login()
	{
		System.out.println("Netflix.login()");
	}
	
	public void subscribe()
	{
		System.out.println("Netflix.subscribe()");
	}
	
	@Override
	public void doWatch() {
		System.out.println("Netflix.doWatch()");
		System.out.println("watching series....");
		
	}
	@Override
	public void cancelSubscription() {
		
		System.out.println("Netflix.cancelSubscription()");
	}
	
}
class Hotstar implements IOTTService
{

	@Override
	public void signUp() {
		System.out.println("Hotstar.signUp()");
		
	}

	@Override
	public void login() {
		System.out.println("Hotstar.login()");
		
	}

	@Override
	public void subscribe() {
		System.out.println("Hotstar.subscribe()");
		
	}

	@Override
	public void doWatch() {
		System.out.println("Hotstar.doWatch()");
		
	}

	@Override
	public void cancelSubscription() {
		System.out.println("Hotstar.cancelSubscription()");
		
	}
	public void shorts30Sec()
	{
		System.out.println("IOTTService.shorts30Sec()");
	}
	
}

public class Driver {

	public static void main(String[] args) {
		MXPlayer m1 = new MXPlayer();
	
		m1.signUp();
		m1.login();
		m1.subscribe();
	    m1.doWatch();
		m1.cancelSubscription();
		
		System.out.println();
		System.out.println("----------------------");
		
		Netflix n1 = new Netflix();
		
		n1.signUp();
		n1.login();
		n1.subscribe();
	    n1.doWatch();
		n1.cancelSubscription();
		
		System.out.println();
		System.out.println("----------------------------");
		
		Hotstar h1 = new Hotstar();
		h1.signUp();
		h1.login();
		h1.subscribe();
		h1.doWatch();
		h1.cancelSubscription();
		h1.shorts30Sec();

		System.out.println();
		System.out.println("-------------------");
		
		
		

	}

}



//interface Payment {
//
//    // abstract method
//    void pay(double amount);
//
//    // static method (utility / common logic)
//    static boolean validateAmount(double amount) {
//        return amount > 0;
//    }
//
//    // another static method
//    static double getTransactionFee(double amount) {
//        return amount * 0.02; // 2% fee
//    }
//}
//
//
//class UPI implements Payment {
//    public void pay(double amount) {
//        if (Payment.validateAmount(amount)) {
//            double fee = Payment.getTransactionFee(amount);
//            System.out.println("UPI Payment Successful: " + (amount - fee));
//        } else {
//            System.out.println("Invalid Amount");
//        }
//    }
//}
//
//// Credit Card Payment
//class CreditCard implements Payment {
//    public void pay(double amount) {
//        if (Payment.validateAmount(amount)) {
//            double fee = Payment.getTransactionFee(amount);
//            System.out.println("Credit Card Payment Successful: " + (amount - fee));
//        } else {
//            System.out.println("Invalid Amount");
//        }
//    }
//}
//
//// Main class
////public class MainApp {
//    //public static void main(String[] args) {
//
//        Payment p1 = new UPI();
//        Payment p2 = new CreditCard();
//
//        p1.pay(1000);
//        p2.pay(2000);
//    }
//}