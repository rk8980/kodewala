package com.kodewala1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest1 {

    Calculator1 calculator1;

    @BeforeAll
    static void setupAll() {
        System.out.println("Before All Tests");
    }

    @BeforeEach
    void setup() {
        System.out.println("Before Each Test");
        calculator1 = new Calculator1();
    }

    @Test
    void testAddition1() {
        assertEquals(15, calculator1.add(10, 5));
    }

    @Test
    void testAddition2() {
        assertEquals(20, calculator1.add(15, 5));
    }

    @AfterEach
    void cleanup() {
        System.out.println("After Each Test");
    }

    @AfterAll
    static void cleanupAll() {
        System.out.println("After All Tests");
    }
}
