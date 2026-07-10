package com.kodewala.abstractpractice;
abstract class Delivery
{
	String packageId;
	
	public abstract void deliver();
	
	public void trackPackage(String packageId)
	{
		System.out.println("Delivery.trackPackage()"+packageId);
	}
}
class ExpressDelivery extends Delivery
{

	@Override
	public void deliver() {
		System.out.println("Deliver in two days");
		trackPackage("1234");
		
	}
	
}
class EkartDelivery extends Delivery
{

	@Override
	public void deliver() {
		System.out.println("Delivery in 7 days ");
		trackPackage("7678");
		
	}
	
}
class SameDayDelivery extends Delivery
{

	@Override
	public void deliver() {
		System.out.println("Delivery within the day");
		trackPackage("9087");
		
	}
	
}
public class Driver1 {

	public static void main(String[] args) {
		Delivery d1 = new ExpressDelivery();
		Delivery d2 = new EkartDelivery();
		Delivery d3 = new SameDayDelivery();
		d1.deliver();
		System.out.println();
		System.out.println("------------------------");
		d2.deliver();
		System.out.println();
		System.out.println("-------------------------");
		d3.deliver();

	}

}
