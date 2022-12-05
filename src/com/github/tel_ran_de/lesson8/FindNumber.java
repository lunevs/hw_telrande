package com.github.tel_ran_de.lesson8;

import java.util.Random;
import java.util.Scanner;

public class FindNumber {

    public static int MAX_TRY = 5;

    public static void main(String[] args) {
        Random rnd = new Random();
        int yorNumber;
        Scanner sc = new Scanner(System.in);
        int i;
        int myNumber;

        while (true) {
            myNumber = rnd.nextInt(1, 11);
            for (i = 0; i < MAX_TRY; i++) {
                System.out.println("Введите ваше число (попытка " + (i + 1) + " из " + MAX_TRY + "):");
                yorNumber = sc.nextInt();

                if (yorNumber == myNumber) {
                    System.out.println("Поздравляю! Верно!");
                    i = MAX_TRY + 1;
                } else {
                    System.out.println("Не совсем... попытка сгорела");
                }

            }

            if (i == MAX_TRY) {
                System.out.println("было загадано число: " + myNumber);
            }

            System.out.println("Хотите попробовать еще? (y / n)");
            String ch = sc.next();
            if (ch.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
