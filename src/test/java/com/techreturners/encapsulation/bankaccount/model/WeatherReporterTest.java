package com.techreturners.encapsulation.bankaccount.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherReporterTest {


    @Test
    public void checkWeatherReportLondon() {
        WeatherReporter weatherRpt = new WeatherReporter("London", 8);
        String expected = "I am in London and it is 🌦. It's too cold 🥶!. The temperature in Fahrenheit is 46.4.";
        assertEquals(expected, weatherRpt.print());
    }

    @Test
    public void checkHotWeatherLondon() {
        WeatherReporter weatherRpt = new WeatherReporter("London", 34);
        String expected = "I am in London and it is 🌦. It's too hot 🥵!. The temperature in Fahrenheit is 93.2.";
        assertEquals(expected, weatherRpt.print());
    }

    @Test
    public void checkHotWeatherCalifornia() {
        WeatherReporter weatherRpt = new WeatherReporter("California", 35);
        String expected = "I am in California and it is 🌅. It's too hot 🥵!. The temperature in Fahrenheit is 95.";
        assertEquals(expected, weatherRpt.print());
    }

    @Test
    public void checkHotWeatherCapeTown() {
        WeatherReporter weatherRpt = new WeatherReporter("Cape TOWN", 48);
        String expected = "I am in Cape TOWN and it is 🌤. It's too hot 🥵!. The temperature in Fahrenheit is 118.4.";
        assertEquals(expected, weatherRpt.print());
    }

    @Test
    public void checkHotWeatherItaly() {
        WeatherReporter weatherRpt = new WeatherReporter("Italy", 24);
        String expected = "I am in Italy and it is 🔆. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 75.2.";
        assertEquals(expected, weatherRpt.print());
    }
}