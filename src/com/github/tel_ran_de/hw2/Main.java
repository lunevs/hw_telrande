package com.github.tel_ran_de.hw2;


public class Main {
    public static void main(String[] args) {

        InputScaner sc = new InputScaner();
        String userMode = sc.getStringValue("Which Area do you want to calculate? Type 'A' if Rectangle or 'B' - Parallelogram");

        if (userMode.equalsIgnoreCase("A")) {

            // получаем переменные на вход для расчета площади Прямоугольника
            int lenA = sc.getIntValue("Enter the length of the first side (in centimeters)");
            int lenB = sc.getIntValue("Enter the length of the second side (in centimeters)");

            // считаем площадь и выводим на печать
            Rectangle rec = new Rectangle(lenA, lenB);
            System.out.println("The rectangle area is: " + rec.getAreaCm());

        } else if (userMode.equalsIgnoreCase("B")) {

            // получаем переменные на вход для расчета площади Параллелограмма
            int lenA = sc.getIntValue("Enter the length of the A side (in centimeters)");
            int heightA = sc.getIntValue("Enter the length of the height to A side (in centimeters)");

            // считаем площадь и выводим на печать
            Parallelogram par = new Parallelogram(lenA, heightA);
            System.out.println("The parallelogram area is: " + par.getAreaCm());

        } else {

            // прощаемся и выходим из программы
            System.out.println("As you wish! Goodbye!");
        }

    }
}
