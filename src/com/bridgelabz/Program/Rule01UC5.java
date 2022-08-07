package com.bridgelabz.Program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Rule01UC5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Password");
        String password = sc.next();
        System.out.println(Pattern.matches("^[a-z][A-Z][0-9][$&+,:;=?@#|'<>.-^*()%!]$", password));
    }
}
