package com.github.tel_ran_de.lesson9;

import java.util.Scanner;

public class ArrayParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив чесел через запятую: ");
        String arrayLine = sc.nextLine();
        String[] arr = arrayLine.split(",");
        int[] arrInt = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
            System.out.println("arrInt[" + i + "]=" + arrInt[i]);
        }
    }
}
