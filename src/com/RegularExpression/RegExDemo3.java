package com.RegularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//PreDefined Character Classes
//Check for -> \\s, \\S, \\d, \\D, \\w, \\W, .
public class RegExDemo3 {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile(".");
        Matcher matcher = pattern.matcher("a7b k@9z");

        while (matcher.find()) {
            System.out.println(matcher.start() + "..." + matcher.group());
        }
    }
}
