package com.iteco;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String inputExample;
        String[] inputArray;
        boolean flag = false;
        int[] ints = new int[2];
        while (true) {
            print();
            int inputOperation = Integer.parseInt(scanner.nextLine());
            if (inputOperation == 3) {
                break;
            }
            if (inputOperation == 2 && !flag) {
                System.out.println("Prohibited");
                continue;
            } else if (inputOperation == 2){
                printChooseOperation();
                inputOperation = Integer.parseInt(scanner.nextLine());
                if (inputOperation == 0 || inputOperation > 8)
                    continue;
                System.out.println(chooseOperation(inputOperation, ints));
            }
            if (inputOperation == 1){
                inputExample = scanner.nextLine();
                inputArray = inputExample.split(" ");
                ints[0] = Integer.parseInt(inputArray[0]);
                String operation = inputArray[1];
                if (inputArray.length >= 3){
                    ints[1] = Integer.parseInt(inputArray[2]);
                }
                System.out.println(chooseOperation(operation, ints));
                flag = true;
            }
        }
    }

    private static int chooseOperation(String operation, int... ints){
        int one = ints[0];
        int two = ints[1];
        switch (operation) {
            case "!":
                return factorial(one);
            case "+":
                return sum(one, two);
            case "-":
                return subtraction(one, two);
            case "*":
                return multiplication(one, two);
            case "/":
                return division(one, two);
            case "^":
                return degree(one, two);
            case "?":
                return compare(one, two);
        }
        return 0;
    }

    private static int chooseOperation(int operation, int... ints){
        int one = ints[0];
        if (operation == 5){
            return factorial(one);
        }
        int two = ints[1];
        switch (operation){
            case 1:
                return sum(one, two);
            case 2:
                return subtraction(one, two);
            case 3:
                return multiplication(one, two);
            case 4:
                return division(one, two);
            case 6:
                return degree(one, two);
            case 7:
                return compare(one, two);
            case 0:
                return 0;
            default:
                return -1;
        }
    }

    private static int sum(int a, int b){
        return a + b;
    }

    private static int subtraction(int a, int b){
        return a - b;
    }

    private static int multiplication(int a, int b){
        return a * b;
    }

    private static int division(int a, int b){
        return a / b;
    }

    private static int factorial(int a){
        if (a <= 0)
            return 0;
        if (a == 1){
            return 1;
        }
        return a * factorial(a - 1);
    }

    private static int degree(int num, int degree){
        if (num <= 0)
            return 0;
        if (degree <= 0)
            return 0;
        if (degree == 1)
            return num;
        return num * degree(num, degree - 1);
    }

    private static int compare(int a, int b){
        return a > b ? a : b;
    }

    private static void print(){
        System.out.println("1. Ввести пример.\n" +
                "2. Продолжить работать с предыдущим ответом.\n" +
                "3. Выход.");
    }

    private static void printChooseOperation(){
        System.out.println("1. Сложение\n" +
                "2. Вычитание\n" +
                "3. Умножение\n" +
                "4. Деление\n" +
                "5. Факториал\n" +
                "6. Возведение в степень\n" +
                "7. Сравнение\n" +
                "0. Назад");
    }
}
