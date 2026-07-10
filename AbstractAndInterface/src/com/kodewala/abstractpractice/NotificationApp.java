package com.kodewala.abstractpractice;
abstract class Notification
{
	protected String message;
	public Notification(String message)
	{
		this.message = message;
	}
	public abstract void send();
	
	// common method 
	public void logNotification()
	{
		System.out.println("Logging notification: " + message);
	}
}

class EmailNotification extends Notification
{

	public EmailNotification(String message) {
		super(message);
	
	}
	public void send()
	{
		System.out.println("Sending Email" + message);
	}
	
}
class SMSNotification extends Notification
{

	public SMSNotification(String message) {
		super(message);
		
	}
	public void send()
	{
		
		System.out.println("Sending SMS: "+ message);
	}
}
public class NotificationApp {

	public static void main(String[] args) {
		Notification n1 = new EmailNotification("order shipped ");
		n1.send();
		n1.logNotification();
		System.out.println();
		System.out.println("--------------");
		
		Notification n2 = new SMSNotification("order delivered ");
		n2.send();
		n2.logNotification();

	}

}
