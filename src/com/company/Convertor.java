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
        romeResult.put(20, "XX");
        romeResult.put(21, "XXI");
        romeResult.put(22, "XXII");
        romeResult.put(23, "XXIII");
        romeResult.put(24, "XXIV");
        romeResult.put(25, "XXV");
        romeResult.put(26, "XXVI");
        romeResult.put(27, "XXVII");
        romeResult.put(28, "XXVIII");
        romeResult.put(29, "XXIX");
        romeResult.put(30, "XXX");
        romeResult.put(31, "XXXI");
        romeResult.put(32, "XXXII");
        romeResult.put(33, "XXXIII");
        romeResult.put(34, "XXXIV");
        romeResult.put(35, "XXXV");
        romeResult.put(36, "XXXVI");
        romeResult.put(37, "XXXVII");
        romeResult.put(38, "XXXVIII");
        romeResult.put(39, "XXXIX");
        romeResult.put(40, "XL");
        romeResult.put(41, "XLI");
        romeResult.put(42, "XLII");
        romeResult.put(43, "XLIII");
        romeResult.put(44, "XLIV");
        romeResult.put(45, "XLV");
        romeResult.put(46, "XLVI");
        romeResult.put(47, "XLVII");
        romeResult.put(48, "XLVIII");
        romeResult.put(49, "XLIX");
        romeResult.put(50, "L");
        romeResult.put(51, "LI");
        romeResult.put(52, "LII");
        romeResult.put(53, "LIII");
        romeResult.put(54, "LIV");
        romeResult.put(55, "LV");
        romeResult.put(56, "LVI");
        romeResult.put(57, "LVII");
        romeResult.put(58, "LVIII");
        romeResult.put(59, "LIX");
        romeResult.put(60, "LX");
        romeResult.put(61, "LXI");
        romeResult.put(62, "LXII");
        romeResult.put(63, "LXIII");
        romeResult.put(64, "LXIV");
        romeResult.put(65, "LXV");
        romeResult.put(66, "LXVI");
        romeResult.put(67, "LXVII");
        romeResult.put(68, "LXVIII");
        romeResult.put(69, "LXIX");
        romeResult.put(70, "LXX");
        romeResult.put(71, "LXXI");
        romeResult.put(72, "LXXII");
        romeResult.put(73, "LXXIII");
        romeResult.put(74, "LXXIV");
        romeResult.put(75, "LXXV");
        romeResult.put(76, "LXXVI");
        romeResult.put(77, "LXXVII");
        romeResult.put(78, "LXXVIII");
        romeResult.put(79, "LXXIX");
        romeResult.put(80, "LXXX");
        romeResult.put(81, "LXXXI");
        romeResult.put(82, "LXXXII");
        romeResult.put(83, "LXXXIII");
        romeResult.put(84, "LXXXIV");
        romeResult.put(85, "LXXXV");
        romeResult.put(86, "LXXXVI");
        romeResult.put(87, "LXXXVII");
        romeResult.put(88, "LXXXVIII");
        romeResult.put(89, "LXXXIX");
        romeResult.put(90, "XC");
        romeResult.put(91, "XCI");
        romeResult.put(92, "XCII");
        romeResult.put(93, "XCIII");
        romeResult.put(94, "XCIV");
        romeResult.put(95, "XCV");
        romeResult.put(96, "XCVI");
        romeResult.put(97, "XCVII");
        romeResult.put(98, "XCVIII");
        romeResult.put(99, "XCIX");
        romeResult.put(100, "C");


        try {
            arabANumber = Integer.parseInt(a);
            if (arabANumber>= 0 && arabANumber<=10){
                try {
                    arabBNumber = Integer.parseInt(b);
                    if (arabBNumber>= 0 && arabBNumber<=10) {
                        System.out.println(Calculator.calculationOfNumerals(arabANumber, arabBNumber, operator));
                    }
                    else {
                        System.out.println("Вы ввели некорректное число");
                    }
                } catch (Exception e) {
                    System.out.println("Вы ввели некорректное число");
                }
            }
            else {
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