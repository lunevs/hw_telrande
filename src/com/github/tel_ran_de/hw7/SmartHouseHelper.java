package com.github.tel_ran_de.hw7;

public class SmartHouseHelper {

    public static boolean isCurtainsOpen = false;

    //поднять шторы
    public static void raiseCurtains() {
        isCurtainsOpen = true;
        System.out.println("Поднимаю шторы... готово!");
    }

    //опустить шторы
    public static void lowerCurtains() {
        isCurtainsOpen = false;
        System.out.println("Закрываю шторы... готово!");
    }

    //включить чайник
    public static void turnOnKettle() {
        System.out.println("Пора попить чайку. Включаю чайник!");
    }
}
