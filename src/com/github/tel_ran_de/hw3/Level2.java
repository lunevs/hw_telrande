package com.github.tel_ran_de.hw3;

import com.github.tel_ran_de.hw2.InputScaner;

public class Level2 {

    static short BINARY_STRING_NUM = 6;

    public static void main(String[] args) {

        // получаем данные на вход и инициализируем переменные
        InputScaner sc = new InputScaner();
        String[] binaryStringArray = new String[BINARY_STRING_NUM];
        for (int i = 0; i < binaryStringArray.length; i++) {
            binaryStringArray[i] = sc.getStringValue("Enter the " + (i+1) + " binary String:");
        }

        // конвертируем в десятичные числа и выводим в консоль
        int binNumber;
        for (String s : binaryStringArray) {
            binNumber = Integer.parseUnsignedInt(s, 2);
            System.out.println(binNumber);
        }


    }
}
