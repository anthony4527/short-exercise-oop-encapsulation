package com.techreturners.encapsulation.bankaccount.model;

public class SunnyCondition {
    public static String checkSunnyDay(String location) {
        if (location.equalsIgnoreCase("London")  ) {

            return "🌦";

        } else if (location.equalsIgnoreCase("California")) {

            return "🌅";

        } else if (location.equalsIgnoreCase("Cape Town")) {

            return "🌤";

        }
        return "🔆";
    }
}
