package com.company;

public class Challenges {

    public static void main(String[] args) {

        // Challenge 1: write the string literal regular expression that will match "I want a bike"
        // Use the String.matches() to verify your answer

        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        // Challenge 2: write a regular expression that will match "I want a bike." and "I want a ball."
        // Verify your answer using the matches() method.

        String regExp = "I want a \\w+.";
        System.out.println(challenge1.matches(regExp));
        String challenge2 = "I want a ball.";
        System.out.println(challenge2.matches(regExp));

        String regExp2 = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp2));
        System.out.println(challenge2.matches(regExp2));


    }
}
