package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        // Challenge 3: In the last challenge (challenge 2) we used the same regular expression twice. Use the
        // Matcher.matches() method to check for matches, instead of String.matches(), for the regular expression
        // that uses \w+ . Hint: You'll have to compile the pattern.

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        // Challenge 4: Replace all occurrences of blank with an underscore for the following string.
        // Print out the resulting string:

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));


    }
}
