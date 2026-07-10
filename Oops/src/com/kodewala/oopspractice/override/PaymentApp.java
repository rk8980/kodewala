package com.kodewala.oopspractice.override;

class PaymentSystem
{
	public void pay()
	{
		System.out.println("doing payment");
	}
}

class PhonePay extends PaymentSystem
{
	public void pay()
	{
		System.out.println("Doing payment by PhonePay");
	}
}

class GPay extends PaymentSystem
{
	public void pay()
	{
		System.out.println("Doing payment by Googlepay");
	}
}
public class PaymentApp {

	public static void main(String[] args) {
		
		PaymentSystem p1 = new PaymentSystem();
		p1.pay();
		System.out.println("---------------------");
		
		PhonePay p2 = new PhonePay();
		p2.pay();
		System.out.println("--------------------");
		
		GPay p3 = new GPay();
		p3.pay();
	}

}






//class Delivery {
// public void deliver() {
//     System.out.println("Delivery process started...");
// }
//}
//

//class StandardDelivery extends Delivery {

// public void deliver() {
//     System.out.println("Standard Delivery: Delivered in 5-7 days.");
// }
//}
//

//class ExpressDelivery extends Delivery {
// @Override
// public void deliver() {
//     System.out.println("Express Delivery: Delivered in 2-3 days.");
// }
//}
//

//class SameDayDelivery extends Delivery {

// public void deliver() {
//     System.out.println("Same Day Delivery: Delivered within 24 hours.");
// }
//}
//

//public class MainApp {
// public static void main(String[] args) {
//     
//     // Parent reference, child objects (Runtime Polymorphism)
//     Delivery d1 = new StandardDelivery();
//     Delivery d2 = new ExpressDelivery();
//     Delivery d3 = new SameDayDelivery();
//
//     d1.deliver();
//     d2.deliver();
//     d3.deliver();
// }
//}
