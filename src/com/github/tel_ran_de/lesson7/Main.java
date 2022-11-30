package com.github.tel_ran_de.lesson7;


public class Main {

    static final int MAX_ARGUMENT = 999;


    public static void main(String[] args) {

        // блок ввода данных и определения переменных
        InputScaner inp = new InputScaner();
        double res = 0;

        int el1 = inp.getIntValue("Enter 1-st operand");
        String op = inp.getStringValue("Enter sign");
        char opC = op.charAt(0);
        int el2 = inp.getIntValue("Enter 2-nd operand");


        // блок вычислительной логики
        if (opC == '+') {
            res = el1 + el2;
        } else if (opC == '/' && el2 != 0) {
            res = (double) el1 / el2;
        } else if (opC == '-') {
            res = el1 - el2;
        } else if (opC == '*') {
            res = el1 * el2;
        }

        // блок проверки ошибок
        if (opC == '/' && el2 == 0) {
            System.out.println("на 0 делить нельзя");
        } else if (el1 > MAX_ARGUMENT || el2 > MAX_ARGUMENT || res > MAX_ARGUMENT) {
            System.out.println("Ошибка: переполнение разрядной сетки");
        } else {
            System.out.println(res);
        }

    }
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

