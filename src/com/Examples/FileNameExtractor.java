package com.Examples;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameExtractor {

    public static void main(String[] args) {

        int count = 0;
        Pattern pattern = Pattern.compile("[a-zA-Z0-9_.$]+[.]class"); // for -> .class files
        // "[a-zA-Z0-9_.$]+[.](txt|class)" -> for both .class and .txt files

        File file = new File("C:\\Users\\uprataps\\IdeaProjects\\" +
                "MultiThreadingEnhancements\\out\\production\\MultiThreadingEnhancements\\" +
                "com\\ExecutorFramework");

        String[] arr = file.list();

        for (String s : arr) {

            Matcher matcher = pattern.matcher(s);

            if (matcher.find() && matcher.group().equals(s)) {

                count++;
                System.out.println(s);
            }
        }

        System.out.println("Total number of .class files in C-Drive is: " + count);
    }
}
