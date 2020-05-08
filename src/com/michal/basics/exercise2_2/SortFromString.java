package com.michal.basics.exercise2_2;

import java.util.Scanner;

public class SortFromString {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        String numbersInString = sc.nextLine();
        String[] split = numbersInString.split(",");
        int counter = 0;

        for (String s : split) {
            int number = Integer.parseInt(s);
            if(number > 10) {
                counter ++;
            }
        }

        System.out.println(counter);
    }
}
