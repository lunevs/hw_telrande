package com.github.tel_ran_de.hw2;

public class Rectangle {
    private static int lenA; // длина стороны А в сантиметрах
    private static int lenB; // длина стороны B в сантиметрах

    Rectangle(int rectLenACm, int rectLenBCm) { // при создании в конструкторе принимаем на вход длины сторон в сантиметрах
        lenA = rectLenACm;
        lenB = rectLenBCm;
    }

    public int getAreaCm() {
        return lenA * lenB;
    }
}
