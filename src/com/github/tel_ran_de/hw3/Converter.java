package com.github.tel_ran_de.hw3;

public class Converter {
    public static void main(String[] args) {

        String str = "Привет, Сергей!";
        int strFrom = str.lastIndexOf(' ');
        int strTo = str.indexOf('!');
        System.out.println(str.substring(strFrom + 1, strTo));
        String[] arrS = str.split(" ");
        for (int i=0; i < arrS.length; i++) {
            System.out.println(i + " " + arrS[i]);
        }


        System.out.println("-------------------------------------------------------------");

        int a = 1000;
        byte b = (byte) a;


        System.out.println(a + " " + Integer.toBinaryString(a));
        System.out.println(b + " " + String.format("%8s",  Integer.toBinaryString(b)));

    }
}
