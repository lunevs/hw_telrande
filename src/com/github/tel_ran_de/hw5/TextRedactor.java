package com.github.tel_ran_de.hw5;

public class TextRedactor {

    String toUpper(String inputString) {
        return inputString.toUpperCase();
    }

    String toLower(String inputString) {
        return inputString.toLowerCase();
    }

    String cutToN(String inputString, int stringCutSize) {
        if (inputString.length() < stringCutSize) {
            return inputString + "...";
        } else {
            return inputString.substring(0, stringCutSize) + "...";
        }
    }
}
