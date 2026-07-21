package com.kodewala.jdbc_commitandrollback;

public class Driver1 {

	public static void main(String[] args) {
		EmployeeSalaryUpdate employeeSalaryUpdate = new EmployeeSalaryUpdate();
		employeeSalaryUpdate.doSalaryUpdate(10000, 1);

	}

}
