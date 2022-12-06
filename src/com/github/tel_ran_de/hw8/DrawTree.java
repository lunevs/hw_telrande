package com.github.tel_ran_de.hw8;

import java.util.Scanner;

public class DrawTree {

    public static void main(String[] args) {

        // определяем переменные и считываем высоту дерева
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой высоты будем строить дерево?");
        int treeHeight = sc.nextInt();
        String curLine = "";

        // расчитываем необходимую ширину строки у дерева
        int treeWidth = treeHeight * 2 + 1;

        // формируем каждую строку и выводим на экран
        for (int i=0; i<treeHeight; i++) {
            curLine = DrawTreeHelper.fillString(i, treeWidth);
            System.out.println(curLine);
        }
    }
}
