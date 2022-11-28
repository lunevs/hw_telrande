package com.github.tel_ran_de.hw5;


public class ThermometerLevel2 {

    private final long celsiusTemp;
    private final long fahrenheitTemp;


    ThermometerLevel2(double temperatureValue, String temperatureKey) {

        if (temperatureKey.equalsIgnoreCase("F")) {
            fahrenheitTemp = roundTemperature(temperatureValue);
            celsiusTemp = calcCelsius(temperatureValue);
        } else {
            celsiusTemp = roundTemperature(temperatureValue);
            fahrenheitTemp = calcFahrenheit(temperatureValue);
        }

    }

    private long roundTemperature(double temp) {
        return Math.round(temp);
    }

    private long calcFahrenheit(double celsiusTemp) {
        double fahTemp = celsiusTemp * 9 / 5 + 32;
        return roundTemperature(fahTemp);
    }

    private long calcCelsius (double fahrenheitTemp) {
        double celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
        return roundTemperature(celsiusTemp);
    }

    public long getCelsius() {
        return celsiusTemp;
    }

    public long getFahrenheit() {
        return fahrenheitTemp;
    }

}
