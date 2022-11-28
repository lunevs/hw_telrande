package com.github.tel_ran_de.hw5;

public class Level2 {

    public static void main(String[] args) {

        // define variables
        InputScaner inpSc = new InputScaner();
        TextEditor te = new TextEditor();
        ThermometerLevel2 tl2;

        // read temperature request and create object
        String strTemp = inpSc.getStringValue("Enter temperature in format: [TEMPERATURE_VALUE] [TEMPERATURE_KEY]\n"
                + " where [TEMPERATURE_KEY] = F for Fahrenheit, or [TEMPERATURE_KEY] = C for Celsius");

        try {
            // pass a string, previously removed all spaces from it
            strTemp = te.removeAllSpaces(strTemp);
            tl2 = new ThermometerLevel2(te.extraxtTemperatureValue(strTemp), te.extraxtTemperatureKey(strTemp));

            // print out result
            System.out.println("Temp in Fahrenheit: " + tl2.getFahrenheit());
            System.out.println("Temp in Celsius: " + tl2.getCelsius());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

}
