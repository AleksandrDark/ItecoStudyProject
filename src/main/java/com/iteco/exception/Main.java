package com.iteco.exception;

import java.util.Scanner;

public class Main {

    final static String DIGITS = "0123456789";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            printMessage();
            String string = input();
            String res = checkNum(string);
            try {
                if (!res.equals(string)){
                    throw new SomeException("Ошибка введена цифра или повторяющееся сочетание букв", res);
                } else {
                    System.out.println(string);
                    break;
                }
            } catch (SomeException e){
                System.out.println(e.getMessage());
                System.out.println(e.getSymbol());
            }
        }
    }

    public static void printMessage(){
        System.out.println("Введите строку без цифр и повторяющихся подряд 3 букв");
    }

    public static String input(){
        return scanner.nextLine();
    }

    private static String checkNum (String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (DIGITS.contains(String.valueOf(chars[i])))
                return String.valueOf(chars[i]);
        }

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length()){
                if (chars[i] == chars[i + 1] && chars[i] == chars[i + 2]){
                    return String.valueOf(chars[i]);
                }
            }
        }
        return s;
    }
}

