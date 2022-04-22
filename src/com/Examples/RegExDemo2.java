package com.Examples;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Program to check whether given e-mail id is valid or Invalid
public class RegExDemo2 {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");

        System.out.println("Enter Email Id: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();

        Matcher matcher = pattern.matcher(email);

        if (matcher.find() && matcher.group().equals(email)) {
            System.out.println("Valid Email Id");
        } else {
            System.out.println("Invalid Email Id");
        }
    }
}
