package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

    public static void main(String[] args) {

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));
        // prints YYYF12Ghhiiiijkl99z

        System.out.println(alphanumeric.replaceAll("^abcDe{3}", "YYY"));
        // prints YYYF12Ghhiiiijkl99z
        // {3} indicates how many times we want 'e' to occur in the parameter

        System.out.println(alphanumeric.replaceAll("^abcDe+", "YYY"));
        // prints YYYF12Ghhiiiijkl99z
        // advantage of '+' is we don't have to provide value within curly braces

        System.out.println(alphanumeric.replaceAll("i+", "YYY"));
        // prints abcDeeeF12GhhYYYjkl99z

        System.out.println(alphanumeric.replaceAll("^abcDe*", "YYY"));
        // prints YYYF12Ghhiiiijkl99z

        System.out.println(alphanumeric.replaceAll("^abcDe{2,5}", "YYY"));
        // prints YYYF12Ghhiiiijkl99z

        String secondAlphanumeric = "abcDeF12Ghhiiiijkl99z";
        System.out.println(secondAlphanumeric.replaceAll("^abcDe{2,5}", "YYY"));
        // prints abcDeF12Ghhiiiijkl99z

        System.out.println(alphanumeric.replaceAll("h+i*j", "Y"));
        // prints abcDeeeF12GYkl99z
        // with other words 'hhiiiij' has been replaced by 'Y'

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-Heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
        // if h2Pattern equals ".*<h2>.*", prints true
        // if h2Pattern equals "<h2>", prints false

        matcher.reset();
        int count = 0;
        while(matcher.find()){
            count++;
            System.out.println("Occurence " + count + " : " + matcher.start() + " to " + matcher.end());
            // prints:
            // Occurence 1 : 19 to 23
            // Occurence 2 : 136 to 140
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()){
            System.out.println("Occurence: " + groupMatcher.group(1));
            // prints:
            // Occurence: <h2>Sub-Heading</h2>
            // Occurence: <h2>Summary</h2>
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while(h2TextMatcher.find()){
            System.out.println("Occurence: " + h2TextMatcher.group(2));
            // parameter 2 in the group() method points to the second parenthesis in line 76
            // prints:
            // Occurence: Sub-Heading
            // Occurence: Summary
        }

        System.out.println("\nand, or & not:");
        // "abc" "a" and "b" and "c"
        // [Hh]arry
        System.out.println("harry".replaceAll("[H|h]", "L"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        // [^abc]
        String tvTest = "tstvtkt";
        String tNotVRegExp = "t[^v]";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while(tNotVMatcher.find()){
            count++;
            System.out.println("Occurence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
            // prints:
            // Occurence 1 : 0 to 2
            // Occurence 2 : 4 to 6
        }

        // ^([\(]{1}[0-9]{3}[\)]{1}[]{1}[0-9]{3}[\-]{1}[0-9]{4})$
        String phone1 = "1234567890"; // shouldn't match
        String phone2 = "(123) 456-7890"; // should match!
        String phone3 = "123 456-7890"; // shouldn't match
        String phone4 = "(123)456-7890"; // shouldn't match


    }
}
