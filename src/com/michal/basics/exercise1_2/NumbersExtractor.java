package com.michal.basics.exercise1_2;

import java.util.Scanner;

public class NumbersExtractor {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        extract(text);
    }


    public static void extract(String source) {
        char[] chars = source.toCharArray();
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                System.out.println(aChar);
            }
        }
    }
}
