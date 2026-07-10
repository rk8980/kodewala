package com.kodewala1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumTest {

    @Test
    public void testMax() {

        Maximum maximum = new Maximum();

        assertEquals(50, maximum.max(20, 50));
    }
}