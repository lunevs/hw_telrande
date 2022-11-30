package com.github.tel_ran_de.lesson7;


public class Main {


    static double calc(char opC, double el1, double el2) {
        if (opC == '+') {
            return el1 + el2;
        } else if (opC == '/' && el2 != 0) {
            return el1 / el2;
        } else if (opC == '-') {
            return el1 - el2;
        } else if (opC == '*') {
            return el1 * el2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        // блок ввода данных и определения переменных
        InputScaner inp = new InputScaner();
        int el1;
        int el2;

        // читаем первую переменную
        if (inp.setIntValue("Enter 1-st operand")) {
            el1 = inp.intValue;
        } else {
            System.out.println(inp.errorMessage);
            return;
        }

        // читаем знак операции
        String op = inp.getStringValue("Enter sign");
        char opC = op.charAt(0);

        // читаем вторую переменную
        if (inp.setIntValue("Enter 2-nd operand")) {
            el2 = inp.intValue;
        } else {
            System.out.println(inp.errorMessage);
            return;
        }

        // блок вычислительной логики
        double res = calc(opC, el1, el2);


        // блок проверки ошибок
        if (opC == '/' && el2 == 0) {
            System.out.println("на 0 делить нельзя");
        } else if (res > InputScaner.MAX_ARGUMENT) {
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

