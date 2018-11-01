package com.kulak.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Operation {
    private static final String ADD = "+";
    private static final String DIVIDE = "/";
    private static final String MULTIPLY = "*";
    private static final String SUB = "-";

    static BigDecimal execute(String args[]) {
        BigDecimal firstNumber = new BigDecimal(args[0]);
        BigDecimal secondNumber = new BigDecimal(args[1]);
        switch (args[2]) {
            case ADD:
                return firstNumber.add(secondNumber);
            case SUB:
                return firstNumber.subtract(secondNumber);
            case MULTIPLY:
                return firstNumber.multiply(secondNumber);
            case DIVIDE:
                try {
                    System.out.println("Choose scale for result form 0 to 9:");
                    return firstNumber.setScale(ConsoleReader.readScale(System.in), BigDecimal.ROUND_HALF_UP).divide(secondNumber, RoundingMode.HALF_UP);
                } catch (ArithmeticException e) {
                    if (args[1].equals("0")) {
                        System.out.println("You can't divide by zero");
                    } else {
                        e.printStackTrace();
                    }
                }
            default:
                throw new RuntimeException("Wrong operation");
        }
    }
}
