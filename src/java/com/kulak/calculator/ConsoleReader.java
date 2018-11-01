package com.kulak.calculator;

import java.io.InputStream;
import java.util.Scanner;

class ConsoleReader {
    private static final int DEFAULT_SCALE = 5;

    static String[] readExpression(InputStream inputStream) {
        Scanner scanner;
        try {
            scanner = new Scanner(inputStream);
            String line = scanner.nextLine();
            if (line.matches("(\\d+\\.)?\\d+\\s*[/*+-]\\s*(\\d+\\.)?\\d+")) {
                String parameters[] = new String[3];
                parameters[0] = line.split("[/*+-]")[0].trim();
                parameters[1] = line.split("[/*+-]")[1].trim();
                parameters[2] = line.replaceFirst(parameters[0], "").replaceFirst(parameters[1], "").trim();
                if (parameters[0].contains(".") && !parameters[1].contains(".")) {
                    parameters[1] += ".0";
                }
                if (parameters[1].contains(".") && !parameters[0].contains(".")) {
                    parameters[0] += ".0";
                }
                return parameters;
            } else if (line.matches("help")) {
                System.out.println(Calculate.HELP);
            } else if (line.matches("exit")) {
                System.exit(1);
            } else {
                System.out.println("Wrong format of input string");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new String[0];
    }

    static Integer readScale(InputStream inputStream) {
        Scanner scanner;
        try {
            scanner = new Scanner(inputStream);
            String line = scanner.nextLine();
            if (line.matches("\\d")) {
                return Integer.parseInt(line);
            } else if (line.matches("help")) {
                System.out.println(Calculate.HELP);
            } else if (line.matches("exit")) {
                System.exit(1);
            } else {
                System.out.println("Wrong format of input string");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DEFAULT_SCALE;
    }

}
