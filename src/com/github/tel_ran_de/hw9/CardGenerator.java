package com.github.tel_ran_de.hw9;

//        Пользователь вводит количество карт, которое ему нужно выдать.
//        Программа случайным образом выбирает из массивов значения номиналов и мастей и выводит требуемое количество карт на экран.

import java.util.Arrays;
import java.util.Scanner;

public class CardGenerator {

    private static Card[] cardArrayGenerator(int n) {
        Card[] resArray = new Card[n];
        for (int i=0; i<n; i++) {
            resArray[i] = new Card();
        }
        return resArray;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько карт нужно создать?");
        int n = sc.nextInt();

        Card[] result = cardArrayGenerator(n);
        String stringResult = Arrays.toString(result);
        System.out.println(stringResult);

    }
}
