package com.kodewala;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SalaryCalculationTest {

    static SalaryCalculation salaryCalculation;

    @BeforeAll
    static void setupAll() {
        salaryCalculation = new SalaryCalculation();
        System.out.println("Starting Salary Calculation Tests...");
    }

    // Salary less than 5000
    @Test
    public void testCalculateSalaryLessThan5k() {

        int expected = -1;
        int actual = salaryCalculation.calculateSalary(4000);

        assertEquals(expected, actual);
    }

    // Boundary Value : 4999
    @Test
    public void testCalculateSalaryAt4999() {

        int expected = -1;
        int actual = salaryCalculation.calculateSalary(4999);

        assertEquals(expected, actual);
    }

    // Boundary Value : Exactly 5000
    @Test
    public void testCalculateSalaryAt5000() {

        int expected = 5000;
        int actual = salaryCalculation.calculateSalary(5000);

        assertEquals(expected, actual);
    }

    // Salary between 5000 and 9999
    @Test
    public void testCalculateSalaryBelow10k() {

        int expected = 9000;
        int actual = salaryCalculation.calculateSalary(9000);

        assertEquals(expected, actual);
    }

    // Boundary Value : 9999
    @Test
    public void testCalculateSalaryAt9999() {

        int expected = 9999;
        int actual = salaryCalculation.calculateSalary(9999);

        assertEquals(expected, actual);
    }

    // Boundary Value : Exactly 10000
    @Test
    public void testCalculateSalaryAt10000() {

        int expected = 11000;

        int actual = salaryCalculation.calculateSalary(10000);

        assertEquals(expected, actual);
    }

    // Salary above 10000
    @Test
    public void testCalculateSalaryAbove10k() {

        int expected = 22000;
        int actual = salaryCalculation.calculateSalary(20000);

        assertEquals(expected, actual);
    }

    // Another salary above 10000
    @Test
    public void testCalculateSalary15000() {

        int expected = 16500;
        int actual = salaryCalculation.calculateSalary(15000);

        assertEquals(expected, actual);
    }

    // Large salary
    @Test
    public void testCalculateSalary50000() {

        int expected = 55000;
        int actual = salaryCalculation.calculateSalary(50000);

        assertEquals(expected, actual);
    }

    @AfterEach
    void cleanup() {
        System.out.println("Test Completed");
    }

    @AfterAll
    static void cleanupAll() {
        System.out.println("All Salary Calculation Tests Completed.");
    }
}