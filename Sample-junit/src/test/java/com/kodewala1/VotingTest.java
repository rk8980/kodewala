package com.kodewala1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class VotingTest {

    @Test
    public void testVoting() {

        Voting voting = new Voting();

        assertTrue(voting.isEligible(20));
    }
}