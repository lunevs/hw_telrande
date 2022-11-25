package com.github.tel_ran_de.hw5;

public class Main {
    public static void main(String[] args) {
        TextRedactor tr = new TextRedactor();

        String upString = "SDF SD FSD FS FSDF SDF SDF SDF S";
        String lowString = "ss dfkjsdfjkshd fjsdjfhs dfjs fjksdh";

        System.out.println("before: " + lowString);
        System.out.println("after: " + tr.toUpper(lowString));

        System.out.println("before: " + upString);
        System.out.println("after: " + tr.toLower(upString));
    }
}
