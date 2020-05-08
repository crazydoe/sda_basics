package com.michal.basics.exercise1_5;

import java.util.Random;
import java.util.Scanner;

public class MoreLessGame {

    public static void main(String... args) {

        int random = new Random().nextInt(100);
        int pickedNumber;
        Scanner scanner = new Scanner(System.in);

        do {
            pickedNumber = Integer.parseInt(scanner.nextLine());
            if (pickedNumber > random) {
                System.out.println("mniej");
            }
            if (pickedNumber < random) {
                System.out.println("więcej");
            }
        } while (pickedNumber != random);

        System.out.println("Bingo!");
    }
}
