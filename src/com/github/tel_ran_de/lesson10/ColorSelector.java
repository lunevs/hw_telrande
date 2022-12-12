package com.github.tel_ran_de.lesson10;

//Создать массив строк с семью цветами радуги.
//        Используя switch, вывести на экран те цвета радуги, которые используются в светофоре.

public class ColorSelector {


    public static void main(String[] args) {

        String[] rainbowColors = {"Red","Orange","Yellow","Green", "Blue", "Indigo", "Violet"};

        for (String rainbowColor : rainbowColors) {

            // 1-й вариант
            switch (rainbowColor) {
                case "Red":
                    System.out.println("Red is used in traffic lights");
                    break;
                case "Yellow":
                    System.out.println("Yellow is used in traffic lights");
                    break;
                case "Green":
                    System.out.println("Green is used in traffic lights");
                    break;
                default:
                    System.out.println(rainbowColor + " is not used in traffic lights");
            }
        }

            // 2-й вариант
        for (String rainbowColor : rainbowColors) {
            switch (rainbowColor) {
                case "Red" -> System.out.println("Red is used in traffic lights");
                case "Yellow" -> System.out.println("Yellow is used in traffic lights");
                case "Green" -> System.out.println("Green is used in traffic lights");
                default -> System.out.println(rainbowColor + " is not used in traffic lights");
            }
        }
    }
}
