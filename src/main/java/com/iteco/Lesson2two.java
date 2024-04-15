package com.iteco;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2two {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите значения двумерного массива через пробел");
        int[][] array = new int[4][3];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        // 1
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[j].length; j++) {
                sum += array[i][j];
            }
            System.out.println("Line " + i + " " + sum);
            sum = 0;
        }
        // 2
        for (int i = 0; i < array[i].length; i++){
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            System.out.println("Column " + i + " " + sum);
            sum = 0;
        }
        // 3
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[j].length; j++) {
                if(array[i][j] % 2 == 0){
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // 4
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[j].length; j++) {
                sum += array[i][j];
                count++;
            }
            System.out.println("Line " + i + " " + sum / count + " ");
            sum = 0;
            count = 0;
        }
        // 5 one dimensional array
        int[] arrayDim = new int[array.length * array[0].length];
        for (int i = array.length - 1; i >= 0; i--){
            for (int j = array[0].length - 1; j >= 0; j--) {
                arrayDim[count] = array[i][j];
                count++;
            }
        }
        System.out.println(Arrays.toString(arrayDim));
    }
}
