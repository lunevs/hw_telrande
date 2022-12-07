package com.github.tel_ran_de.lesson9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OddNumbers {

    public static int[] randomArrayInit(int arraySize) {
        int[] arr = new int[arraySize];

        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(-1000, 1000);
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите размер создаваемого массива: ");
        int arrSize = sc.nextInt();

        int[] myArray = randomArrayInit(arrSize);
        int minElement = myArray[0];
        int maxElement = myArray[0];

        for (int j : myArray) {
            if (j < minElement) {
                minElement = j;
            }
            if (j > maxElement) {
                maxElement = j;
            }
        }
        System.out.println("получился массив: " + Arrays.toString(myArray));
        System.out.println("минимальный элемент массива= " + minElement + ", максимальный = " + maxElement);

    }
}
