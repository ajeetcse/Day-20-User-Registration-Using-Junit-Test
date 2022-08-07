package com.bridgelabz.Program;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AllEmailProvidedSeparatelyUC9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your All Email Samples Provided Separately");
        String password = sc.next();
        System.out.println(Pattern.matches("^[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)$", password));
    }
}
