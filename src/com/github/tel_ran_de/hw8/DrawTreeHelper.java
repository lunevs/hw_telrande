package com.github.tel_ran_de.hw8;

public class DrawTreeHelper {
    final static String TREE_EL = "ˆ";

    public static String fillString(int treeLevel, int treeWidth) {

        int numEls = treeLevel * 2 + 1;                     // количество элементов дерева на этом уровне
        int numSpaces = (treeWidth - numEls) / 2;           // количество пробелов на этом уровне
        String result = "";

        for (int i=0; i<numSpaces; i++) {                   // заполняем пробелами первую часть строки
            result = result.concat(" ");
        }
        for (int i=0; i<numEls; i++) {                      // рисуем кусочек дерева
            result = result.concat(TREE_EL);
        }
        for (int i=0; i<numSpaces; i++) {                   // заполняем вторую часть строки пробелами
            result = result.concat(" ");
        }
        return result;
    }

}
