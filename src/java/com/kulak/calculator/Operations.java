package com.kulak.calculator;

import java.math.BigDecimal;
import java.util.function.Function;

public enum Operations {
    ADD("+"),
    SUB("-"),
    MULTIPLY("*"),
    DEVIDE("/");

    String value;

    Operations(String s) {
        this.value = s;
    }

//    public Function<BigDecimal, BigDecimal> getOperation() {
//        Function function;
//        switch (this) {
//            case ADD:
//                function = BigDecimal::add(new BigDecimal(b));
//                break;
//            case SUB:
//                break;
//            case MULTIPLY:
//                break;
//            case DEVIDE:
//                break;
//        }
//        return function;
//    }
}
