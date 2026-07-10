package com.kodewala.arraylistpracticehome;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;

	// Constructor
	public Employee(int employeeId, String employeeName, double salary) {
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

	@Override
	public String toString() {
		return "Employee Id : " + employeeId +
			   ", Employee Name : " + employeeName +
			   ", Salary : " + salary;
	}
}