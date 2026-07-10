package com.kodewala1;

public class Voting {

    public boolean isEligible(int age) {

        if (age >= 18) {
            return true;
        }

        return false;
    }
}