package com.kodewala.interfacemultipleinheritance1;

public interface  IPayment {
	void pay();
	
}
@FunctionalInterface
interface  IRefund extends IPayment
{
	//void settle();
	public void pay();
}




