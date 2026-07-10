package com.kodewala.employeemanagement;

import java.util.ArrayList;

class Employee {

	// Private Variables
	private int employeeId;
	private String employeeName;
	private double salary;

	// Constructor
	Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	// Getter Methods
	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getSalary() {
		return salary;
	}

	// Setter Method
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class EmployeeManagement {

	public static void main(String[] args) {

		// Create ArrayList
		ArrayList<Employee> employeeList = new ArrayList<>();

		// Add Employees
		employeeList.add(new Employee(101, "Rahul", 35000));
		employeeList.add(new Employee(102, "Aman", 40000));
		employeeList.add(new Employee(103, "Abishek", 45000));
		employeeList.add(new Employee(104, "Sumit", 8763456));

		// Display All Employees
		System.out.println("----- Employee Details -----");

		for (int i = 0; i < employeeList.size(); i++) {

			Employee e = employeeList.get(i);

			System.out.println("Employee ID : " + e.getEmployeeId());
			System.out.println("Employee Name : " + e.getEmployeeName());
			System.out.println("Salary : " + e.getSalary());

			System.out.println("----------------------------");
		}

		// Search Employee By ID
		int searchId = 102;

		for (int i = 0; i < employeeList.size(); i++) {

			Employee e = employeeList.get(i);

			if (e.getEmployeeId() == searchId) {

				System.out.println("\nEmployee Found");

				System.out.println("Employee ID : " + e.getEmployeeId());
				System.out.println("Employee Name : " + e.getEmployeeName());
				System.out.println("Salary : " + e.getSalary());
			}
		}

		// Update Salary
		int updateId = 101;

		for (int i = 0; i < employeeList.size(); i++) {

			Employee e = employeeList.get(i);

			if (e.getEmployeeId() == updateId) {

				e.setSalary(50000);

				System.out.println("\nSalary Updated Successfully");
			}
		}

		// Remove Employee
		int removeId = 103;

		for (int i = 0; i < employeeList.size(); i++) {

			Employee e = employeeList.get(i);

			if (e.getEmployeeId() == removeId) {

				employeeList.remove(i);

				System.out.println("\nEmployee Removed Successfully");
			}
		}

		// Display Updated Employee List
		System.out.println("\n----- Updated Employee Details -----");

		for (int i = 0; i < employeeList.size(); i++) {

			Employee e = employeeList.get(i);

			System.out.println("Employee ID : " + e.getEmployeeId());
			System.out.println("Employee Name : " + e.getEmployeeName());
			System.out.println("Salary : " + e.getSalary());

			System.out.println("----------------------------");
		}
	}
}
