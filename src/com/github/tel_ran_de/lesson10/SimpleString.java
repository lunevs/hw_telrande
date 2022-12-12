package com.github.tel_ran_de.lesson10;

public class SimpleString {

    private char[] innerString;

    public SimpleString(String inputString) {
        innerString = inputString.toCharArray();
    }

    public char charAt(int i) {
        return innerString[i];
    }

    // считаем что верхний индекс не включается
    public String substring(int fromIndex, int toIndex) {
        StringBuilder sb = new StringBuilder("");
        for (int i=fromIndex; i<toIndex; i++) {
            sb.append(innerString[i]);
        }
        return sb.toString();
    }
}
