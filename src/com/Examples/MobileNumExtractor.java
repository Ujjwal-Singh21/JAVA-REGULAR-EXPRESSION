package com.Examples;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumExtractor {

    public static void main(String[] args) throws Exception {

        PrintWriter pw = new PrintWriter("Write.txt");
        Pattern pattern = Pattern.compile("(0|91)?[6-9][0-9]{9}");

        BufferedReader br = new BufferedReader(new FileReader("Read.txt"));
        String line = br.readLine();

        while (line != null) {

            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                pw.println(matcher.group());
            }

            line = br.readLine();
        }

        pw.flush();
        pw.close();
        br.close();

    }
}
