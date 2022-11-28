package com.github.tel_ran_de.lesson6;

import java.util.Random;

public class Main {

    static Random rnd = new Random();

    public static String genRandomBinary(int length) {
        String res = "";
        for(int i=0; i<length; i++) {
            res += rnd.nextInt(0, 2);
        }
        return res;
    }

    public static void main(String[] args) {
        int cube1;
        int cube2;

        cube1 = rnd.nextInt(1, 7);
        cube2 = rnd.nextInt(1, 7);
        System.out.println(cube1 + " " + cube2);

        String str1 = genRandomBinary(8);
        System.out.println(str1);

        String str2 = genRandomBinary(16);
        System.out.println(str2);
    }
}
