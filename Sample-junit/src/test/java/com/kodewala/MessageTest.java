package com.kodewala;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MessageTest {

    @Test
    public void testMessage() {

        Message message = new Message();

        String expected = "Hello";
        String actual = message.getMessage();

        assertEquals(expected, actual);
    }
}