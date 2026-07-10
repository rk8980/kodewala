package com.kodewala1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EvenTest {

    Even even;

    @BeforeAll
    static void setupAll() {
        System.out.println("Starting Even Number Tests...");
    }

    @BeforeEach
    void setup() {
        System.out.println("Creating Even Object");
        even = new Even();
    }

    @Test
    public void testEvenNumber() {

        assertTrue(even.isEven(10));

    }

    @Test
    public void testAnotherEvenNumber() {

        assertTrue(even.isEven(20));

    }

    @AfterEach
    void cleanup() {
        System.out.println("Test Completed");
    }

    @AfterAll
    static void cleanupAll() {
        System.out.println("All Even Number Tests Completed.");
    }
}