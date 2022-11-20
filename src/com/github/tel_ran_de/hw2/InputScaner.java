package com.github.tel_ran_de.hw2;

import java.util.Scanner;

public class InputScaner {
    private static Scanner scanner;

    InputScaner() {
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
