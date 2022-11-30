package com.github.tel_ran_de.lesson7;

public class Main {

    public static void main(String[] args) {

        System.out.println("необходимо реагента: " + ParkingPlace.getReagentNeed() + " на " + ParkingPlace.parkingNum + " парковок");
        ParkingPlace pl1 = new ParkingPlace("001");
        System.out.println("необходимо реагента: " + ParkingPlace.getReagentNeed() + " на " + ParkingPlace.parkingNum + " парковок");
        ParkingPlace pl2 = new ParkingPlace("002");
        System.out.println("необходимо реагента: " + ParkingPlace.getReagentNeed() + " на " + ParkingPlace.parkingNum + " парковок");
        ParkingPlace pl3 = new ParkingPlace("003");
        System.out.println("необходимо реагента: " + ParkingPlace.getReagentNeed() + " на " + ParkingPlace.parkingNum + " парковок");

        System.out.println(pl1);
        System.out.println(pl2);
        System.out.println(pl3);

        // занимаем место парковки
        pl1.bookPlace("DF 234");
        pl3.bookPlace("NM 534");


        System.out.println(pl1);
        System.out.println(pl2);
        System.out.println(pl3);

    }
}

