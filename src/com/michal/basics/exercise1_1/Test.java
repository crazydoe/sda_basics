package com.michal.basics.exercise1_1;

import java.util.Scanner;

public class Test {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int offset = scanner.nextInt();

        String encryptedText = CesarEncryptor.encrypt(text, offset);

        System.out.println(encryptedText);

        String decryptedText = CesarEncryptor.decrypt(encryptedText, offset);

        System.out.println(decryptedText);
    }
}
