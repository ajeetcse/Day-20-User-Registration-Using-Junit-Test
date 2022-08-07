package com.bridgelabz.Program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidationUC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email");
        String email = sc.next();
        System.out.println(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email));
    }
}
