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

        // Challenge 5: Write a regular expression that will match the following string in its entirety.
        // Use the String.matches() method to verify your answer.

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));

        // Challenge 6: Write a regular expression that will only match the challenge5 string in its entirety.

        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        System.out.println(challenge5.replaceAll("^a{3}bc{8}d{3}ef{3}g$", "REPLACED"));

        // Challenge 7: Write a regular expression that will match a string that starts with a series of letters.
        // The letters must be followed by a period. After the period, there must be a series of digits.
        // The string "kjisl.22" would match. The string "f5.12a" would not. Use this string to test your reg expression

        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));

        // Challenge 8: Modify the regular expression in challenge 7 to use a group, so that we can print
        // all the digits that occur in a string that contains multiple occurences of the pattern.
        // Write all the code required to accomplish this (create a pattern and matcher, etc.).
        // Use the following string to test your code:

        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern8 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher8 = pattern8.matcher(challenge8);
        while (matcher8.find()){
            System.out.println("Occurence: " + matcher8.group(1));
            // group 0 is entire string, in this case for example: abcd.135 or uvqz.7
            // group 1 is digits
        }




    }
}
