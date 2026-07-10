package com.kodewala;

import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        PaymentService  paymentService = new PaymentService();
//        paymentService.getAllPayments("'paid'");
        
        
        paymentService.updatePayment(1003, "paid");
        //hello
       System.out.println("hello");
       //hello 
       //hello
    }
}
