package com.michal.basics.exercise1_1;

public class CesarEncryptor {

    public static String encrypt(String source, int offset) {
        char[] chars = source.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] += offset;
        }

        return String.valueOf(chars);
    }

    public static String decrypt(String source, int offset) {
        return encrypt(source, -offset);
    }
}
