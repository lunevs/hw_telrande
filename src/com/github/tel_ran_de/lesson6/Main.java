package com.github.tel_ran_de.lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int cube1;
        int cube2;

        // делаем сотню бросаний
        for (int i=0; i<100; i++) {
            cube1 = rnd.nextInt(1, 7);
            cube2 = rnd.nextInt(1, 7);

            System.out.println(cube1 + " " + cube2);
        }
    }
}
