package com.michal.basics.exercise1_6;

import java.util.Arrays;

public class Censorship {

    private static final String[] FORBIDDEN = {"tu", "powinny", "być", "bardzo", "brzydkie", "słowa"};

    public static void main(String... args) {
        String text = "Jakiś super bardzo przykładowy tekst tu jest i słowa które powinny być zakazane";

        for (String word : FORBIDDEN) {
            int length = word.length();
            String stars = getStars(length);
            text = text.replaceAll(word, stars);
        }

        System.out.println(text);
    }

    public static String getStars(int length) {
        char[] stars = new char[length];
        Arrays.fill(stars, '*');
        return String.valueOf(stars);
    }
}
