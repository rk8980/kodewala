package com.kodewala.oopspractice.inheritance.overloading;
class Employee
{
	public void calculateSalary(int salary)
	{
		System.out.println("Base salary of Employee is :"+ salary);
	}
	
	public void calculateSalary(int salary, int bonus)
	{
		int newSalary = salary + bonus;
		System.out.println("Salary with Bonus of a Employe is : "+ newSalary);
	}
	
	public void calculateSalary(int salary, int bonus,int incentive)
	{
		int newSalary = salary + bonus + incentive;
		System.out.println("Salary with Bonus and Incentive of a Employe is : "+ newSalary);
	}
}
public class SalaryApp {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.calculateSalary(15000);
		System.out.println("---------------------");
		emp.calculateSalary(15000, 2000);
		System.out.println("---------------------");
		emp.calculateSalary(15000, 2000, 1000);

	}

}
