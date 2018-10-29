package com.kulak.calculator;

import java.io.InputStream;
import java.util.Scanner;

public class ConsoleReader {
    public static String[] read(InputStream inputStream) {
        Scanner scanner;
        String result[] = new String[3];
        try {
            scanner = new Scanner(inputStream);
            String line = scanner.nextLine();
            if (line.matches("\\d+\\s*[/*+-]\\s*\\d+")) {
                result[0] = line.split("[/*+-]")[0].trim();
                result[1] = line.split("[/*+-]")[1].trim();
                result[2] = line.replace(result[0],"").replace(result[1],"").trim();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
