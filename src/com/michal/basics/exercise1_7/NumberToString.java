package com.michal.basics.exercise1_7;

import java.util.Scanner;

public class NumberToString {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(convertToText(number));

    }

    public static String convertToText(Integer number) {
        if (number <= 20) {
            return convert(number);
        }
        int secondNumber = number % 10;
        int firstNumber = number - secondNumber;
        return convert(firstNumber) + " " + convert(secondNumber);
    }

    public static String convert(Integer number) {
        switch (number) {
            case 1:
                return "jeden";
            case 2:
                return "dwa";
            case 3:
                return "trzy";
            case 4:
                return "cztery";
            case 5:
                return "pięć";
            case 6:
                return "sześć";
            case 7:
                return "siedem";
            case 8:
                return "osiem";
            case 9:
                return "dziewięć";
            case 10:
                return "dziesięć";
            case 11:
                return "jedenaście";
            case 12:
                return "dwanaście";
            case 13:
                return "trzynaście";
            case 14:
                return "czternaście";
            case 15:
                return "piętnaście";
            case 16:
                return "szesnaście";
            case 17:
                return "siedemnaście";
            case 18:
                return "osiemmnaście";
            case 19:
                return "dziewiętnaście";
            case 20:
                return "dwadzieścia";
            case 30:
                return "trzydzieści";
            case 40:
                return "czterdzieści";
            case 50:
                return "pięćdziesiat";
            case 60:
                return "sześćdziesiat";
            case 70:
                return "siedemdziesiąt";
            case 80:
                return "osiemdziesiąt";
            case 90:
                return "dziewięćdziesiąt";
        }
        return "NaN";
    }

}
