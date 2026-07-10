package com.kodewala.oopspractice.polymorphism;

class Employee {

    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return 0; 
    }
}

class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class Freelancer extends Employee {

    private int projects;
    private double ratePerProject;

    public Freelancer(String name, int projects, double ratePerProject) {
        super(name);
        this.projects = projects;
        this.ratePerProject = ratePerProject;
    }

    @Override
    public double calculateSalary() {
        return projects * ratePerProject;
    }
}

class SalaryService {

    public void printSalary(Employee emp) {
        System.out.println(emp.name + " Salary: ₹" + emp.calculateSalary());
    }
}

public class EmployeeApp {

    public static void main(String[] args) {

        SalaryService service = new SalaryService();

        Employee e1 = new FullTimeEmployee("Rahul", 50000);
        Employee e2 = new PartTimeEmployee("Abhishek", 5, 5000);
        Employee e3 = new Freelancer("Sumit", 3, 10000);

        service.printSalary(e1);
        service.printSalary(e2);
        service.printSalary(e3);
    }
}
