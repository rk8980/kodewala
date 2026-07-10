package com.kodewala.oopspractice.polymorphism;

class InvoiceMgmt
{
	
}
class GSTInvoice extends  InvoiceMgmt
{
	
}
public class Driver {

	public static void main(String[] args) {
		InvoiceMgmt invoiceMgmt = new InvoiceMgmt();
		InvoiceMgmt invoice1 = (InvoiceMgmt)new  GSTInvoice(); // up casting
		
		GSTInvoice gstInvoice = new GSTInvoice();
		GSTInvoice gst = (GSTInvoice)new InvoiceMgmt(); // down casting

	}

}
