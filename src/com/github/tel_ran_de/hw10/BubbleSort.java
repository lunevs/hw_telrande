package com.github.tel_ran_de.hw10;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static int[] sortNumbers(int[] inputArray) {

        int[] arr = inputArray.clone();
        for (int i=1; i<arr.length; i++) {

            for (int j=0; j<arr.length-i; j++) {
                if (arr[j+1] < arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите последовательность чисел через пробел:");
        String inputLine = sc.nextLine();
        String[] inputArray = inputLine.split(" ");
        int[] numbers = new int[inputArray.length];

        try {
            for (int i=0; i<numbers.length; i++) {
                numbers[i] = Integer.parseInt(inputArray[i]);
            }
        } catch (Exception e) {
            System.out.println("неверный формат числа");
        }

        System.out.println("исходный массив: " + Arrays.toString(numbers));
        System.out.println("отсортированный массив: " + Arrays.toString(sortNumbers(numbers)));
    }
}
