package com.company;

public class Calculator {
    public static int calculationOfNumerals(int a, int b, String arithmeticOperation) {
        int result = 0;

        if (arithmeticOperation.charAt(0) == ('+')) {
            result = a + b;
        }
        if (arithmeticOperation.charAt(0) == ('-')) {
            result = a - b;
        }
        if (arithmeticOperation.charAt(0) == ('*')) {
            result = a * b;
        }
        if (arithmeticOperation.charAt(0) == ('/')) {
            result = a / b;
        }
        return result;
    }
}
