package com.bridgelabz.Program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Rules04UC8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Password Exactly One Special Character");
        String password = sc.next();
        System.out.println(Pattern.matches("^[a-z][A-Z][0-9][$&+,:;=?@#|'<>.-^*()%!]{1}$", password));
    }
}
