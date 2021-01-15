package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в прогамму Калькулятор!");
        System.out.println("формат ввода: 'a + b'");
        String input = scanner.nextLine();
        Convertor convertor = new Convertor();
        convertor.breakIntoElements(input);

    }
}
