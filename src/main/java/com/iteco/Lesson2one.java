package com.iteco;

import java.util.Arrays;

public class Lesson2one {
    static int[] array = {3, 22, 1, 13, 4, 6, 16, 5};

    public static void main(String[] args) {
        for (int i: array){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i: array){
            if (i > 9 && i < 100){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int y = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > y){
                y = array[i];
            }
        }
        System.out.println(y);

        int sum = 0;
        for (int i: array){
            sum += i;
        }
        System.out.println(sum);

        int[] arrayReverse = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayReverse[i] = array[array.length - i - 1];
        }
        System.out.println(Arrays.toString(arrayReverse));
    }
}
