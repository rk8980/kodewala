package com.amazon.di.setter.emp;

import com.amazon.di.setter.address.Address;


public class Employee {

	private int salary;
	private String name;

	private Address address;

	public Employee(int salary, String name) {
		super();
		System.out.println("1. Employee.Employee() - constructor ");
		this.salary = salary;
		this.name = name;
	}

	public void setAddress(Address _address) {
		System.out.println("2. Employee.Employee() - Dependecny Injection ");
		this.address = _address;
	}

	public void printInfo() {
		System.out.println("4. Employee.Employee() - Doing work ");
		address.displayAddressInfo();
	}

}