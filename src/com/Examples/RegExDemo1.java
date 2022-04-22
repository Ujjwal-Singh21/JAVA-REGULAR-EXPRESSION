package com.Examples;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Program to check whether given mobile number is valid or Invalid
public class RegExDemo1 {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("(0|91)?[6-9][0-9]{9}");

        System.out.println("Enter Mobile Number: ");
        Scanner scanner = new Scanner(System.in);
        String mobileNumber = scanner.next();

        Matcher matcher = pattern.matcher(mobileNumber);

        if (matcher.find() && matcher.group().equals(mobileNumber)) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }
    }
}
