package com.github.tel_ran_de.hw2;

public class Parallelogram {
    private static int heightA; // длина высоты опущенной на сторону А в сантиметрах
    private static int lenA; // длина стороны А в сантиметрах

    Parallelogram(int paralLenACm, int paralHeightACm) {
        lenA = paralLenACm;
        heightA = paralHeightACm;
    }

    public int getAreaCm() {
        return lenA * heightA;
    }
}
