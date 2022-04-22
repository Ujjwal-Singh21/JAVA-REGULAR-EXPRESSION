package com.RegularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Character Classes
//Check for -> [abc], [^abc], [a-z], [0-9], [a-zA-Z0-9], [^a-zA-Z0-9]
public class RegExDemo2 {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher("a3b#k@9z");

        while (matcher.find()) {
            System.out.println(matcher.start() + "..." + matcher.group());
        }
    }
}
