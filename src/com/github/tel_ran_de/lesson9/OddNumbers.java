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
        int[] copiedArray = myArray.clone();
        Arrays.sort(copiedArray);

        int minElement = copiedArray[0];
        int maxElement = copiedArray[copiedArray.length-1];

        int minInd = 0;
        int maxInd = 0;

        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] == minElement) {
                minInd = j;
            }
            if (myArray[j] == maxElement) {
                maxInd = j;
            }
        }


        System.out.println("получился массив: " + Arrays.toString(myArray));
        System.out.println("минимальный элемент массива= " + minElement + " с индексом = " + minInd);
        System.out.println("максимальный элемент массива= " + maxElement + " с индексом = " + maxInd);



    }
}
