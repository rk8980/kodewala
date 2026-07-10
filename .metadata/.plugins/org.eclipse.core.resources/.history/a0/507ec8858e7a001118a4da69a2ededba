package com.kodewala1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class BankTest {

    Bank bank;

    @BeforeEach
    void setup() {
        bank = new Bank();
        System.out.println("Bank Object Created");
    }

    @Test
    void testBalance() {
        assertEquals(1000, bank.getBalance());
    }

    @AfterEach
    void cleanup() {
        System.out.println("Bank Object Destroyed");
    }
    
    @AfterAll
    static void cleanUpAll()
    {
    	System.out.println("Bank test finished");
    }
}