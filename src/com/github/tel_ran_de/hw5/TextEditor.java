package com.github.tel_ran_de.hw5;

public class TextEditor {

    public String removeAllSpaces(String inputString) {
        return String.join("", inputString.split(" "));
    }

    public double extraxtTemperatureValue(String inputString) {
        return Double.parseDouble(inputString.substring(0, inputString.length()-1));
    }

    public String extraxtTemperatureKey(String inputString) {
        return inputString.substring(inputString.length()-1);
    }

}
