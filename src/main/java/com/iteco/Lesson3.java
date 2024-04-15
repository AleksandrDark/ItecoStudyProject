package com.iteco;

import java.util.Scanner;

public class Lesson3 {
    private static String name;
    private static String numberStr;

    public static void main(String[] args) {
        while (true) {
            if (checkInputFormat(input())) {
                int number = sumNumber(numberStr);
                print(name, convertStringNumber(number));
                break;
            }
        }
    }

    private static String input(){
        System.out.println("Введите имя и число через пробел");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static boolean checkInputFormat(String input){
        if(input.split(" ").length == 2){
            separateInput(input);
            return checkSecondArgInputNumberLength(numberStr);
        } else return false;
    }

    private static void separateInput(String input){
        String[] inputStr = input.split(" ");
        name = inputStr[0];
        numberStr = inputStr[1];
    }

    private static boolean checkSecondArgInputNumberLength(String num) {
        int length = num.length();
        return length >= 2 && length <= 5;
    }

    private static int sumNumber(String number) {
        if (number.length() == 1){
            return Integer.parseInt(number);
        }
        int num = Integer.parseInt(number) % 10;
        return num + sumNumber(number.substring(0 ,number.length() - 1));
    }

    private static String convertStringNumber(int number) {
        switch (number){
            case 1:
                return "Один";
            case 2:
                return "Два";
            case 3:
                return "Три";
            case 4:
                return "Четыре";
            case 5:
                return "Пять";
            case 6:
                return "Шесть";
            case 7:
                return "Семь";
            case 8:
                return "Восемь";
            case 9:
                return "Девять";
            case 10:
                return "Десять";
            default:
                return "Неопределенно";
        }
    }

    private static void print(String name, String num){
        System.out.printf("Здравствуй %s! Сумма цифр в числе = " + "%s", name, num);
    }


}
