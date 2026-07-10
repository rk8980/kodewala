package com.kodewala.interfacemultipleinheritance;
interface IPayment {
	void pay();

}
interface IRefund
{
	void pay();
}

class UPIPayment implements IPayment , IRefund
{

	@Override
	public void pay() {
		System.out.println("UPIPayment.pay()");
		
	}

}

interface Login1 {
    default void authenticate()
    {
    	System.out.println("Login.authenticate()");
    }
    
    
}
interface LogOut2
{
	default void authenticate()
	{
		System.out.println("LogOut.authenticate()");
	}
}

class GoogleLogin1 implements Login1,LogOut2 {
    public void authenticate() {
       Login1.super.authenticate();
    }
}

class EmailLogin1 implements Login1, LogOut2 {
    public void authenticate() {
    	LogOut2.super.authenticate();
}
}




//class OrderSystem {
//
//    // Nested Interface
//    interface Delivery {
//        void deliver(String item);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        // Implementing nested interface
//        OrderSystem.Delivery d = (item) -> {
//            System.out.println(item + " delivered successfully");
//        };
//
//        d.deliver("Laptop");
//        d.deliver("Mobile");
//    }
//}