package com.amazon.config;

import java.beans.BeanProperty;
import java.beans.JavaBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.di.constructor.address.Address;
import com.amazon.di.constructor.emp.Employee;

@Configuration
public class SpringConfig {
	@Bean
	public Address address()
	{
		Address address = new Address("28th Main", "17th Cross", "BLR", "Karnatka");
		return address;
		
	}
	
	@Bean("emp1")
	public Employee employee(Address address)
	{
		Employee employee = new Employee(1200000, "Rahul", address); // address is mandotory
		return employee;
	}
	

}
