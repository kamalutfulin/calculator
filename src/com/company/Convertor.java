package com.company;

import java.util.HashMap;

public class Convertor {
    static int currentSimvolPosition = 0;

    public void breakIntoElements(String input) {
        String a = "";
        String b = "";
        String operator = "";
        int currentSimvolPosition = 0; //1 - число означает этап ( их 3 : вычленение 1 числа, оператора, третьего числа),
// 2 число означает на какой позиции сейчас в Строке Инпут
        a = String.valueOf(input.charAt(0));
        currentSimvolPosition = 10;
        if (input.charAt(1) != (' ')) {
            a += input.charAt(1);
            currentSimvolPosition = 11;
            if (input.charAt(2) != ' ') {
                a += input.charAt(2);
                currentSimvolPosition = 12;
            }
        }

        if (currentSimvolPosition == 12) {
            if (input.charAt(4) == '+' || input.charAt(4) == '-' || input.charAt(4) == '*' || input.charAt(4) == '/') {
                operator = String.valueOf(input.charAt(4));
                currentSimvolPosition = 22;
            }
        }
        if (currentSimvolPosition == 11) {
            if (input.charAt(3) == '+' || input.charAt(3) == '-' || input.charAt(3) == '*' || input.charAt(3) == '/') {
                operator = String.valueOf(input.charAt(3));
                currentSimvolPosition = 21;
            }
        }
        if (currentSimvolPosition == 10) {
            if (input.charAt(2) == '+' || input.charAt(2) == '-' || input.charAt(2) == '*' || input.charAt(2) == '/') {
                operator = String.valueOf(input.charAt(2));
                currentSimvolPosition = 20;
            }
        }

        if (currentSimvolPosition == 22) {
            b = String.valueOf(input.charAt(6));
            try {
                b += String.valueOf(input.charAt(7));
                b += String.valueOf(input.charAt(8));
            } catch (Exception e) {

            }
        }
        if (currentSimvolPosition == 21) {
            b = String.valueOf(input.charAt(5));
            try {
                b += String.valueOf(input.charAt(6));
                b += String.valueOf(input.charAt(7));
            } catch (Exception e) {

            }

        }

        if (currentSimvolPosition == 20) {
            b = String.valueOf(input.charAt(4));
            try {
                b += String.valueOf(input.charAt(5));
                b += String.valueOf(input.charAt(6));
            } catch (Exception e) {

            }
        }
        identifyArabicOrRomano(a, b, operator);
    }

    public static void identifyArabicOrRomano(String a, String b, String operator) {
        int arabANumber = 0;
        int arabBNumber = 0;
        String romeANumber = "";
        String romeBNumber = "";
        HashMap<String, Integer> romeNumbersOfCalculator = new HashMap<String, Integer>();
        romeNumbersOfCalculator.put("I", 1);
        romeNumbersOfCalculator.put("II", 2);
        romeNumbersOfCalculator.put("III", 3);
        romeNumbersOfCalculator.put("IV", 4);
        romeNumbersOfCalculator.put("V", 5);
        romeNumbersOfCalculator.put("VI", 6);
        romeNumbersOfCalculator.put("VII", 7);
        romeNumbersOfCalculator.put("VIII", 8);
        romeNumbersOfCalculator.put("IX", 9);
        romeNumbersOfCalculator.put("X", 10);


        HashMap<Integer, String> romeResult = new HashMap<Integer, String>();
        romeResult.put(0, "В римской системе счисления не было нуля :) ");
        romeResult.put(1, "I");
        romeResult.put(2, "II");
        romeResult.put(3, "III");
        romeResult.put(4, "IV");
        romeResult.put(5, "V");
        romeResult.put(6, "VI");
        romeResult.put(7, "VII");
        romeResult.put(8, "VIII");
        romeResult.put(9, "IX");
        romeResult.put(10, "X");
        romeResult.put(11, "XI");
        romeResult.put(12, "XII");
        romeResult.put(13, "XIII");
        romeResult.put(14, "XIV");
        romeResult.put(15, "XV");
        romeResult.put(16, "XVI");
        romeResult.put(17, "XVII");
        romeResult.put(18, "XVIII");
        romeResult.put(19, "XIX");



        try {
            arabANumber = Integer.parseInt(a);
            if (arabANumber >= 0 && arabANumber <= 10) {
                try {
                    arabBNumber = Integer.parseInt(b);
                    if (arabBNumber >= 0 && arabBNumber <= 10) {
                        System.out.println(Calculator.calculationOfNumerals(arabANumber, arabBNumber, operator));
                    } else {
                        System.out.println("Вы ввели некорректное число");
                    }
                } catch (Exception e) {
                    System.out.println("Вы ввели некорректное число");
                }
            } else {
                System.out.println("Вы ввели некорректное число");
            }

        } catch (Exception e) {
            try {
                System.out.println(romeResult.get(Calculator.calculationOfNumerals(romeNumbersOfCalculator.get(a), romeNumbersOfCalculator.get(b), operator)));

            } catch (Exception exception) {
                System.out.println("Вы ввели некорректное число");
            }

        }
    }
}