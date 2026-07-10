package com.kodewala;


public class SalaryCalculation {

    public int calculateSalary(int baseSalary) {

        if (baseSalary < 5000) {
            return -1;
        }

        if (baseSalary < 10000) { // between 5000 and 10000
            return baseSalary;
        }
        // above 10000
        int bonus = (baseSalary * 20) / 100;
        int tax = (baseSalary * 10) / 100;

        return baseSalary + bonus - tax;
    }
}