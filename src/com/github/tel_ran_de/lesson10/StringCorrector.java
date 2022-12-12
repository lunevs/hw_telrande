package com.github.tel_ran_de.lesson10;

import java.util.Scanner;

public class StringCorrector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Пользователь вводит с клавиатуры несколько слов через пробел.
        //        Напишите программу, которая (используя методы классов String и StringBuilder):
        System.out.println("Введите предложение:");
        String inputString = sc.nextLine();
        StringBuilder sb = new StringBuilder(inputString);

        // 1) сначала удалим пробелы, если они вдруг есть в начале или в конце строки

        // удаляем пробелы вначале строки
        while (sb.charAt(0) == ' ') {
            sb.deleteCharAt(0);
        }
        // удаляем двойные пробелы
        char currentElement = sb.charAt(0);
        for (int i=1; i<sb.length(); i++) {
            if (sb.charAt(i) == ' ' && currentElement == ' ') {
                sb.deleteCharAt(i);
                i--;
            }
            currentElement = sb.charAt(i);
        }
        // удаляем пробел в конце строки, если остался
        if (sb.charAt(sb.length()-1) == ' ') {
            sb.deleteCharAt(sb.length()-1);
        }

        // 1) Проверит, заканчивается ли предложение точкой. Если нет - добавит в конце предложения точку.
        if (!inputString.endsWith(".")) {
            sb.append(".");
        }

        // 2) Проверит, начинается ли предложение с большой буквы (if(Character.isUpperCase('A')){...}).
        // Если нет - сделает первую букву заглавной (char capitalChar = Character.toUpperCase('a');).
        if (!Character.isUpperCase(sb.charAt(0))) {
            sb.replace(0, 1, String.valueOf(Character.toUpperCase(sb.charAt(0))));
        }


        // И выведет результат на экран.
        System.out.println(sb);
    }
}
