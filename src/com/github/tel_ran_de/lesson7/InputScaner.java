package com.github.tel_ran_de.lesson7;

import java.util.Scanner;

public class InputScaner {
    private static Scanner scanner;
    public int intValue;
    public String strValue;
    public String errorMessage;

    static final int MAX_ARGUMENT = 999;

    public InputScaner() {
        errorMessage = "";
        scanner = new Scanner(System.in);
    }

    public String getStringValue(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public int getIntValue(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public boolean setIntValue(String message) {
        intValue = getIntValue(message);
        errorMessage = "Ошибка: переполнение разрядной сетки";
        return intValue < MAX_ARGUMENT;
    }

}
