package com.github.tel_ran_de.hw9;

//First level: Дан массив, содержащий все возможные номиналы игральных карт: 6, 7, …, Король, Туз.
//        Дан массив, содержащий все возможные масти игральных карт: "Пик", "Треф", "Бубен", "Червей".


import java.util.Random;

public class Card {

    public static final String[] nominals = {"6", "7", "8", "9", "Король", "Туз"};
    public static final String[] suit = {"Пик", "Треф", "Бубен", "Червей"};

    public String myNominal;
    public String mySuit;

    public Card() {
        Random rnd = new Random();
        int idxNominal = rnd.nextInt(0, nominals.length);
        int idxSuit = rnd.nextInt(0, suit.length);

        myNominal = nominals[idxNominal];
        mySuit = suit[idxSuit];
    }

    @Override
    public String toString() {
        return "Card{" +
                "myNominal='" + myNominal + '\'' +
                ", mySuit='" + mySuit + '\'' +
                '}';
    }
}
