package com.RegularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Quantifiers
//Check for -> a, a+, a*, a?
public class RegExDemo4 {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("a?");
        Matcher matcher = pattern.matcher("abaabaaab");

        while (matcher.find()) {
            System.out.println(matcher.start() + "..." + matcher.group());
        }
    }

}
