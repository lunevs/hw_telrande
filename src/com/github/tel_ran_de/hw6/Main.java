package com.github.tel_ran_de.hw6;

public class Main {

    public static void main(String[] args) {

        // в Кинотеатре 5 посадочных мест
        Seat cinemaSeat1 = new Seat("seatCode_001");
        Seat cinemaSeat2 = new Seat("seatCode_002");
        Seat cinemaSeat3 = new Seat("seatCode_003");
        Seat cinemaSeat4 = new Seat("seatCode_004");
        Seat cinemaSeat5 = new Seat("seatCode_005");


        // текущее состояние брони
        System.out.println("---------------START POSITION---------------------");
        System.out.println(cinemaSeat1);
        System.out.println(cinemaSeat2);
        System.out.println(cinemaSeat3);
        System.out.println(cinemaSeat4);
        System.out.println(cinemaSeat5);
        System.out.println("--------------------------------------------------");


        // бронируем место для Ивана
        cinemaSeat1.book("Ivan", "Music evening");

        // бронируем место для Марии
        cinemaSeat3.book("Ivan", "Music evening");

        // бронируем место для Джона
        cinemaSeat4.book("John", "Cool film 5.0");

        // текущее состояние брони
        System.out.println("---------------END   POSITION---------------------");
        System.out.println(cinemaSeat1);
        System.out.println(cinemaSeat2);
        System.out.println(cinemaSeat3);
        System.out.println(cinemaSeat4);
        System.out.println(cinemaSeat5);
        System.out.println("--------------------------------------------------");

    }
}
