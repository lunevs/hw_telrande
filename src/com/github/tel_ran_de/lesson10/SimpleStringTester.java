package com.github.tel_ran_de.lesson10;

//Самостоятельно реализовать простую версию класса String:
//        1) Создать класс SimpleString, хранящий содержимое строки в виде массива типа char.
//        2) Использовать конструктор класса SimpleString для инициализации его содержимого.
//        3) Реализовать метод charAt(int i), возвращающий символ типа char по указанному индексу.
//        4) Реализовать метод substring(int fromIndex, int toIndex), возвращающий подстроку типа String

public class SimpleStringTester {

    public static void main(String[] args) {

        String testString = "test simple string";
        SimpleString ss = new SimpleString(testString);
        System.out.println(ss.charAt(5));
        System.out.println(ss.charAt(0));
        System.out.println(ss.charAt(testString.length()-1));

        System.out.println(ss.substring(0, testString.length()));
        System.out.println(ss.substring(0, 1));
        System.out.println(ss.substring(5, 11));
    }
}
