package com.github.tel_ran_de.hw4;

import java.util.Scanner;

public class Lesson {

    public static void fun1 () {

        Scanner inpSc = new Scanner(System.in);

        System.out.println("Enter number 1");
        int a = inpSc.nextInt();

        System.out.println("Enter number 2");
        int b = inpSc.nextInt();

        System.out.println("деление нацело: " + (a / b));
        System.out.println("остаток от деления: " + (a % b));
        System.out.println("точный результат: " + (double) a / b);
    }

    public static void fun2() {
        int a = (byte) 44;
        int b = (short) 300;
        short c = (short) (b - a);
        System.out.println(c);
    }

    public static void main(String[] strings) {

//        char sym = 'A';
//        while (sym != 'z') {
//            System.out.println(sym);
//            sym += 1;
//        }
//
//
//        Teacher mathTeacher = new Teacher();
//        mathTeacher.name = "Ivan Ivanovich";
//
//        Teacher bioTeacher = new Teacher();
//        bioTeacher.name = "Petr Petrovich";
//
//        System.out.println(mathTeacher);
//        System.out.println(bioTeacher);
//
//        // замена преподавателя
//        bioTeacher = mathTeacher;
//
//        System.out.println(mathTeacher);
//        System.out.println(bioTeacher);
//
//        // новый преподаватель вновь на биологии
//        bioTeacher = new Teacher();
//        bioTeacher.name = "Sergei Sergeevich";
//
//        System.out.println(mathTeacher);
//        System.out.println(bioTeacher);

        int idx = 0;
        idx++;
        idx--;
        idx = idx + 1;
        idx =- 1;
        idx = idx % idx;

        if (idx >= 0) {
            --idx;
        } else {
            idx++;
        }
        System.out.println( (double) idx);

    }
}
