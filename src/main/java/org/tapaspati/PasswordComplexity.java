package org.tapaspati;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordComplexity {


    public static boolean isPasswordComplex(String input) {

        //6 character

        if(input.length() < 6) return false;

        //one uppercase
        //one lower case
        //one number

        String regex = "^(?=.*[a-z])(?=."
                + "*[A-Z])(?=.*\\d)"
                + "(?=.*[-+_!@#$%^&*., ?]).+$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // Find match between given string
        // & regular expression
        Matcher m = p.matcher(input);
        return m.matches();


    }
}
