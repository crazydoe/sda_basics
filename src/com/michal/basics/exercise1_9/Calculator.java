package com.michal.basics.exercise1_9;

import java.util.Scanner;

public class Calculator {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("wprowadź ułamek (x/y)");
        String first = sc.nextLine();
        System.out.println("wprowadź ułamek (x/y)");
        String second = sc.nextLine();

        int firstNominator = Integer.parseInt(first.split("/")[0]);
        int firstDenominator = Integer.parseInt(first.split("/")[1]);

        int secondNominator = Integer.parseInt(second.split("/")[0]);
        int secondDenominator = Integer.parseInt(second.split("/")[1]);

        int commonDenominator = firstDenominator * secondDenominator;
        firstNominator *= secondDenominator;
        secondNominator *= firstDenominator;

        System.out.println(firstNominator + secondNominator);
        System.out.println("--");
        System.out.println(commonDenominator);

    }


}
