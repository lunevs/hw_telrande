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
//        int cube1;
//        int cube2;
//
//        cube1 = rnd.nextInt(1, 7);
//        cube2 = rnd.nextInt(1, 7);
//        System.out.println(cube1 + " " + cube2);
//
//        String str1 = genRandomBinary(8);
//        System.out.println(str1);
//
//        String str2 = genRandomBinary(16);
//        System.out.println(str2);

        System.out.println("-----------------------");

//        Car volvo = new Car("BD 534", "Volvo XC60");
//        Car vw = new Car("PG 253", "VW Golf");
//        Car mazda = new Car("NK 645", "Mazda 3");
//
//        System.out.println(volvo);
//        System.out.println(vw);
//        System.out.println(mazda);
//        System.out.println("-----------------------");
//
//        mazda.isRented = true;
//
//        mazda = new Car("BD 123");
//        mazda.model = "Mazda 3";
//        mazda.isRented = true;
//
//        System.out.println(volvo);
//        System.out.println(vw);
//        System.out.println(mazda);
//
//        System.out.println("-----------------------");

        ParkingPlace pl1 = new ParkingPlace("001");
        ParkingPlace pl2 = new ParkingPlace("002");
        ParkingPlace pl3 = new ParkingPlace("003");

        // занимаем место парковки
        pl1.bookPlace("DF 234");
        System.out.println("place " + pl1.getCode() + " занято? " + pl1.getStatus());

        // освобождаем место
        pl1.freePlace();
        System.out.println("place " + pl1.getCode() + " занято? " + pl1.getStatus());

    }
}

