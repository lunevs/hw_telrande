package com.github.tel_ran_de.hw3;

import com.github.tel_ran_de.hw2.InputScaner;

public class Level1 {
    public static void main(String[] args) {

        // получаем данные на вход и инициализируем переменные
        InputScaner sc = new InputScaner();
        String fullString = sc.getStringValue("Enter the String from which you want to cut the Word");
        String cutWord = sc.getStringValue("Enter the Word to be cut");
        StringCutter strCut = new StringCutter(fullString);

        // удаляем из строки слово инструментами с урока
        System.out.println(strCut.removeWordMethod1(cutWord));

        // удаляем из строки слово альтернативными инструментами
        System.out.println(strCut.removeWordMethod2(cutWord));

    }
}
