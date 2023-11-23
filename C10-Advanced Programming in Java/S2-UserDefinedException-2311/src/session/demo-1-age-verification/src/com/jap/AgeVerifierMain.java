package com.jap;

public class AgeVerifierMain {
    public static void main(String[] args) {

        AgeVerifier ageVerifier = new AgeVerifier();

        try {

            ageVerifier.verifyAge(10);

        } catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());}}
}
