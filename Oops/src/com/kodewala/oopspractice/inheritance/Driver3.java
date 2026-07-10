package com.kodewala.oopspractice.inheritance;
class Notifications {
	String countryName = "India";
	public void sendEmails(String email, String text, String attchment) 
	{
		System.out.println("Notifications.sendEmail()");
	}
	
	public void sendSMS(String mobile, String text)
	{
		System.out.println("Notifications.sendSMS()");
	}


}


class Order extends Notifications
{
	public void orderDeleivered()
	{
		String text = "order is deleivered succesfully";
		sendEmails("userid", "", "pdf");
		sendSMS("12345", "text");
	}
}
public class Driver3 {
	public static void main(String[] args) {
		Order order = new Order();
		order.orderDeleivered();
	}
}
