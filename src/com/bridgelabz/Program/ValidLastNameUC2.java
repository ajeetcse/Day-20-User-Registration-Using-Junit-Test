package com.bridgelabz.Program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidLastNameUC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Last Name");
        String lastName = sc.next();
        System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2}$", lastName));


    }
}
