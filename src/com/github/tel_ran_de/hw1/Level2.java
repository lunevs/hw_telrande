package com.github.tel_ran_de.hw1;

public class Level2 {
    public static void main(String[] args) {
        // symbol type
        int inputNumber = 345;

        // calculate parts of number
        int units = inputNumber % 10;
        int dozens = (inputNumber / 10) % 10;
        int hundreds = inputNumber / 100;

        // output
        System.out.println("input number: " + inputNumber);
        System.out.println("units: " + units);
        System.out.println("dozens: " + dozens);
        System.out.println("hundreds: " + hundreds);
    }
}
