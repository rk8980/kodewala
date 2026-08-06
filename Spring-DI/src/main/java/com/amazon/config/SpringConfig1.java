package com.amazon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.di.setter.address.Address;
import com.amazon.di.setter.emp.Employee;


@Configuration
public class SpringConfig1 {

	@Bean
	public Address address() {
		Address address = new Address("28th Main", "17th Cross", "BLR", "Karnataka");

		return address;
	}

	/*
	 * @Bean("emp1") public Employee employee(Address address) { Employee employee =
	 * new Employee(1200000, "Rahul", address); // address is mandatory return
	 * employee; }
	 */

	@Bean("emp2")
	public Employee employee(Address address) {
		Employee employee = new Employee(1200000, "Rahul"); 
		
		employee.setAddress(address); // optional 
		return employee;
	}

}