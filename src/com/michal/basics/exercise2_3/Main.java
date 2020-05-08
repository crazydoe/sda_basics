package com.michal.basics.exercise2_3;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String compressed = SmsCompressor.compress(text);
        System.out.println(compressed);
    }
}
