package com.github.tel_ran_de.hw5;

public class Level1 {

    public static void main(String[] args) {

        // define variables
        InputScaner inpSc = new InputScaner();
        ThermometerLevel1 tl1 = new ThermometerLevel1();

        // read celsius Temp and calculate Fahrenheit
        double celsiusTemp = inpSc.getDoubleValue("Enter celsius temperature: ");
        System.out.println("Temp in Fahrenheit: " + tl1.getFahrenheit(celsiusTemp));

        // read fahrenheit Temp and calculate celsius
        double fahrenheitTemp = inpSc.getDoubleValue("Enter fahrenheit temperature: ");
        System.out.println("Temp in Celsius: " + tl1.getCelsius(fahrenheitTemp));
    }
}
