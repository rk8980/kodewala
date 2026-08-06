package com.amazon;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.account.beans.Account;
import com.amazon.account.beans.Payment;
import com.amazon.account.config.SpringConfig;
import com.amazon.account.config.SpringConfigAnnotation;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigAnnotation.class);
        
//        Account acc =  (Account) context.getBean("acc1");
//        acc.displayAccountInfo();
//        
//       Account acc1 =  (Account) context.getBean("acc2");
//       acc1.displayAccountInfo();
        
        Payment pay = context.getBean(Payment.class);
        pay.showPayment();
    }
}
