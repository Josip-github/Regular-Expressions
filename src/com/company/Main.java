package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "I am a string. Yes, I am.";
        System.out.println(str);
        String yourString = str.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondAlphanumeric = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondAlphanumeric.replaceAll("^abcDeee", "YYY"));
        // character ^ makes sure only first occurence of given parameter will be handled

        System.out.println(alphanumeric.matches("^hello")); // prints false
        System.out.println(alphanumeric.matches("^abcDeee")); // prints false
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z")); // prints true

        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END"));
        // prints abcDeeeF12GhhiiiTHE END

        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        // prints XbcDXXXF12GhhXXXXjkl99z

        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));
        // prints abcDeeX12GhhiiiXkl99z

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));
        // prints Harry

        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));
        // prints XXXXeeeXXXXXXXXXXjXXXXX

        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
        // prints XXXDXXXF12Ghhiiiijkl99z

        System.out.println(newAlphanumeric.replaceAll("[a-f3-8]", "X"));
        // prints exactly the same as the previous sout: XXXDXXXF12Ghhiiiijkl99z

        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        // regular expressions are case-sensitive!
        // prints XXXXXXXX12Ghhiiiijkl99z

        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        // (?i) for case-insensitivity
        // prints XXXXXXXX12Ghhiiiijkl99z

        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        // all digits are replaced with 'X'
        // prints abcDeeeFXXGhhiiiijklXXz

        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));
        // all digits are replaced with 'X'
        // prints abcDeeeFXXGhhiiiijklXXz

        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));
        // replaces all non-digits with 'X'
        // prints XXXXXXXX12XXXXXXXXXX99X

        String hasWhiteSpace = "I have blanks and\ta tab, and also a new line\n";
        System.out.println(hasWhiteSpace);
        // prints I have blanks and 	a tab, and also a new line
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        // prints Ihaveblanksandatab,andalsoanewline

        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));
        // prints I have blanks andXa tab, and also a new line

        System.out.println(hasWhiteSpace.replaceAll("\\S", ""));
        // only tab, spaces and newline characters remain; in a way opposite to \\s


        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
        // prints XXXXXXXXXXXXXXXXXXXXXXX
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));
        // prints  X XXXX XXXXXX XXX	X XXX, XXX XXXX X XXX XXXX

        System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));
        // each word is being surrounded by the replacement string
        // prints XIX XhaveX XblanksX XandX	XaX XtabX, XandX XalsoX XaX XnewX XlineX
    }
}
