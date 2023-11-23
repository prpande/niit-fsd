package com.jap;

public class AgeVerifier {
    public void verifyAge(int age) throws InvalidAgeException {

        if (age < 13) {

            throw new InvalidAgeException("Cannot register on the platform, not a valid age");
        }
    }
}
