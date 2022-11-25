package com.github.tel_ran_de.hw5;

public class Main {
    public static void main(String[] args) {
        TextRedactor tr = new TextRedactor();

        String upString = "SDF SD FSD FS FSDF SDF SDF SDF S";
        String lowString = "ss dfkjsdfjkshd fjsdjfhs dfjs fjksdh";
        String longString = "DF df gdfgdF Gdfg dFG dfg d gDF Gdf gdGD FGD Fg dfgD";

        System.out.println("before: " + lowString);
        System.out.println("after: " + tr.toUpper(lowString));
        System.out.println("");

        System.out.println("before: " + upString);
        System.out.println("after: " + tr.toLower(upString));
        System.out.println("");

        try {
            System.out.println("before: " + longString);
            System.out.println("after (cut 10 symbols): " + tr.cutToN(longString, 1000));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + longString);
        }

    }
}
