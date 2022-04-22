package com.RegularExpression;
import java.util.regex.Pattern;

//Pattern(C) -> split() method
public class RegExDemo5 {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("\\s");

        String[] arr = p.split("Durga Software Solutions");

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
