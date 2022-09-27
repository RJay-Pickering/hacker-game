package com.company;

import java.util.Random;

public class scramble {

    int attempts = 0;

    public static Random rng = new Random();

    public static int randomInt(int max) {
        return rng.nextInt(max);
    };

    public static String chooseAnswer() {
        String[] possibleAnswers = new String[]{
                "password",
                "passhack",
                "hackmans",
                "gokachus",
                "12345678",
                "cyborg12",
                "voodoovp",
                "cowboys1",
                "discords",
                "zoomcall",
                "vidogame"
        };

        return possibleAnswers[randomInt(possibleAnswers.length)];
    }
}
