package com.kulak.calculator;

import java.math.BigDecimal;

public class Calculate {
    public static void main(String[] args) {
        String []parameters = ConsoleReader.read(System.in);
        System.out.println(new BigDecimal(parameters[0]));
    }
}
