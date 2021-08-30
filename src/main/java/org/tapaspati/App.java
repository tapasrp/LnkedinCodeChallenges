package org.tapaspati;

import java.io.IOException;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {


        System.out.println("enter your password:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Is this password complex ? : " + PasswordComplexity.isPasswordComplex(input));

//        System.out.println("enter a number:");
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        System.out.println("Is this number even ? : " + EvenOrOdd.isEven(input));


    }
}
