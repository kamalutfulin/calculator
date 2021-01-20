package com.company;

public class Calculator {
    public static int calculationOfNumerals(int a, int b, String arithmeticOperation) {
        int result = 0;

        switch (arithmeticOperation.charAt(0)) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;

            case '/':
                result = a / b;
                break;
        }
        return result;
    }
}
