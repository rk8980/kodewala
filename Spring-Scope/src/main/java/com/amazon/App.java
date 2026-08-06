package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.bean.Payment;
import com.amazon.config.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       
       Payment payment1 = (Payment) context.getBean("pay1"); // requesting payment
       
       Payment payment2 = (Payment) context.getBean("pay1"); // requesting payment
       
       System.out.println(payment1 == payment2);  // true then same 
    }
}
