package com.Examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {

    public static void main(String[] args) throws Exception {

        PrintWriter pw = new PrintWriter("Write.txt");
        Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");

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
