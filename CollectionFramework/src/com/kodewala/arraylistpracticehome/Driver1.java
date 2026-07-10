package com.kodewala.arraylistpracticehome;

import java.util.ArrayList;

public class Driver1 {

	public static void main(String[] args) {

		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		// Adding Employees
		employeeList.add(new Employee(101, "Rahul", 35000));
		employeeList.add(new Employee(102, "Aman", 40000));
		employeeList.add(new Employee(103, "Rohit", 45000));
		employeeList.add(new Employee(104, "Karan", 50000));

		System.out.println("Original Employee List : ");
		System.out.println(employeeList);

		// Remove Employee
		employeeList.remove(2);

		System.out.println();
		System.out.println("After Removing Employee : ");
		System.out.println(employeeList);

		// Update Salary
		employeeList.get(1).setSalary(55000);

		System.out.println();
		System.out.println("After Updating Salary : ");
		System.out.println(employeeList);

		// Search Employee
		System.out.println();
		System.out.println("Searching Employee : ");

		for(Employee emp : employeeList)
		{
			if(emp.getEmployeeId() == 101)
			{
				System.out.println(emp);
			}
		}
	}
}