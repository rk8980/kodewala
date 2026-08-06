package com.amazon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.amazon.config.SpringConfig;
import com.amazon.config.SpringConfig1;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig1.class);

		com.amazon.di.setter.emp.Employee e1 = (com.amazon.di.setter.emp.Employee) context.getBean("emp2");

		e1.printInfo();
		context.close();
	}
}