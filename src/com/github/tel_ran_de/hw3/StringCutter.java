package com.github.tel_ran_de.hw3;

public class StringCutter {
    public String myString;

    StringCutter(String newString) {
        myString = newString;
    }

    public String removeWordMethod1(String word) {
        String tmpString = myString;
        int wordIndex = tmpString.indexOf(word);
        while (wordIndex != -1) {
            tmpString = tmpString.substring(0, wordIndex) + tmpString.substring(wordIndex + word.length());
            wordIndex = tmpString.indexOf(word);
        }
        return tmpString;
    }

    public String removeWordMethod2(String word) {
        String[] cleanString = myString.split(word);
        return String.join("", cleanString);
    }

}
