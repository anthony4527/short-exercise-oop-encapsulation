package com.techreturners.encapsulation.bankaccount.model;

public class HotColdThreshold {

    private static final double HOT = 30.0;
    private static final double COLD = 10.0;

    public static String checkTempThreshold (double temperature) {
        if (temperature > HOT) {

            return "It's too hot 🥵!";

        } else if (temperature < COLD) {

            return "It's too cold 🥶!";
        }
        return "Ahhh...it's just right 😊!";
    }
}
