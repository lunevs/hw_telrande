package com.github.tel_ran_de.lesson7;

import java.util.Scanner;

public class InputScaner {
    private static Scanner scanner;

    public InputScaner() {
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

}
