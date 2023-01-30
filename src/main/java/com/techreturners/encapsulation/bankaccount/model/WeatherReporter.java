package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {
    private final double FahrenCelciusSCALE = (9.0 / 5.0);
    private final double FahrenCelciusDIFF = 32.0;

    private final String location;
    private final double temperature;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String print() {

        double newTemp = FahrenCelciusSCALE * temperature + FahrenCelciusDIFF ;
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.",
                location, SunnyCondition.checkSunnyDay( location ), HotColdThreshold.checkTempThreshold(temperature), newTemp);

    }

    /* public static void main(String[] args) {
        WeatherReporter weatherHere = new WeatherReporter("France", 18);
        System.out.println (weatherHere.print());
    }*/
}
