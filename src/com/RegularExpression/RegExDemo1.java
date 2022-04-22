package com.RegularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("ab");

        Matcher matcher = pattern.matcher("abbabbba");

        int count = 0;

        while (matcher.find()) {

            count++;
            System.out.println(matcher.start() + "..." + matcher.end() + "..." + matcher.group());
        }

        System.out.println("Total number of occurrences: " + count);
    }
}
