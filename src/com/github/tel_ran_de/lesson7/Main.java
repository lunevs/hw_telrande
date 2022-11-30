package com.github.tel_ran_de.lesson7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int el1 = sc.nextInt();
        String op = sc.next();
        char opC = op.charAt(0);
        int el2 = sc.nextInt();

        double res = 0;
        if (opC == '+') {
            res = el1 + el2;
        } else if (opC == '/' && el2 != 0) {
            res = (double) el1 / el2;
        }

        if (opC == '/' && el2 == 0) {
            System.out.println("на 0 делить нельзя");
        } else {
            System.out.println(res);
        }

//        System.out.println("необходимо реагента: " + ParkingPlace.getReagentNeed() + " на " + ParkingPlace.parkingNum + " парковок");
//        ParkingPlace pl1 = new ParkingPlace("001");
//
//        System.out.println("необходимо реагента: " + ParkingPlace.getReagentNeed() + " на " + ParkingPlace.parkingNum + " парковок");
//        ParkingPlace pl2 = new ParkingPlace("002");
//
//        System.out.println("необходимо реагента: " + ParkingPlace.getReagentNeed() + " на " + ParkingPlace.parkingNum + " парковок");
//        ParkingPlace pl3 = new ParkingPlace("003");
//
//        System.out.println("необходимо реагента: " + ParkingPlace.getReagentNeed() + " на " + ParkingPlace.parkingNum + " парковок");
//
//        System.out.println(pl1);
//        System.out.println(pl2);
//        System.out.println(pl3);
//
//        // занимаем место парковки
//        pl1.bookPlace("DF 234");
//        pl3.bookPlace("NM 534");
//
//
//        System.out.println(pl1);
//        System.out.println(pl2);
//        System.out.println(pl3);

    }
}

