package com.bridgelabz.Program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumberValidationUC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone Number: ");
        String phoneNumber = sc.next();
        System.out.println(Pattern.matches("^[0|91]?[7-9][0-9]{9}$", phoneNumber));
    }
}
