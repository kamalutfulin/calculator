package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в прогамму Калькулятор!");
        System.out.println("Формат ввода: 'a + b'" + " или V + V (Калькулятор должен принимать на вход числа от 1 до 10 или от I до X включительно, не более)");
        String input = scanner.nextLine();
        Convertor convertor = new Convertor();
        convertor.breakIntoElements(input);
    }
}
