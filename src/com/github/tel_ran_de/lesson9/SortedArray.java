package com.github.tel_ran_de.lesson9;

//Дан массив чисел произвольного размера, заполненный целыми числами.
//        Определить и вывести на экран решение - являются ли значения элементов массива возрастающей последовательностью.

import java.util.Arrays;
import java.util.Random;

public class SortedArray {

    public static int[] randomArray() {
        Random rnd = new Random();
        int arrSize = rnd.nextInt(10, 100);
        int[] arr = new int[arrSize];

        for (int i=0; i<arrSize; i++) {
            arr[i] = rnd.nextInt(0, 500);
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] rndArray = randomArray();
        int[] orderedArray = rndArray.clone();
        Arrays.sort(orderedArray);

        System.out.println("получился массив: " + Arrays.toString(rndArray));
        if (Arrays.equals(rndArray, orderedArray)) {
            System.out.println("массив возрастающий");
        } else {
            System.out.println("массив НЕ возрастающий");
        }


    }
}
