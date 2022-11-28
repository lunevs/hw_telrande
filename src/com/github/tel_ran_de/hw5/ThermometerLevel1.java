package com.github.tel_ran_de.hw5;

public class ThermometerLevel1 {

    private long roundTemperature(double temp) {
        return Math.round(temp);
    }

    public long getFahrenheit(double celsiusTemp) {
        double fahTemp = celsiusTemp * 9 / 5 + 32;
        return roundTemperature(fahTemp);
    }

    public long getCelsius (double fahrenheitTemp) {
        double celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
        return roundTemperature(celsiusTemp);
    }
}
