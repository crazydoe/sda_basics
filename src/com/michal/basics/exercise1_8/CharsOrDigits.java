package com.michal.basics.exercise1_8;

import java.util.Scanner;

public class CharsOrDigits {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        int digits = 0;
        int chars = 0;
        char aChar;

        while (true) {
            aChar = sc.next().charAt(0);
            if (aChar == '@') {
                break;
            }
            if (Character.isDigit(aChar)) {
                digits++;
            } else {
                chars++;
            }
        }

        System.out.println("Użytkownik wpisał więcej " + (digits > chars ? "liczb" : "znaków"));
    }
}
