package com.michal.basics.exercise2_3;

public class SmsCompressor {

    //ą, ć, ę, ł, ń, ó, ś, ź, ż
    private static final char[][] REPLACEMENTS = {
            {'ą', 'a'}, {'ć', 'c'}, {'ę', 'e'},
            {'ł', 'l'}, {'ń', 'n'}, {'ó', 'o'},
            {'ś', 's'}, {'ź', 'z'}, {'ż', 'z'}
    };

    public static String compress(String text) {
        for (char[] replacement : REPLACEMENTS) {
            char source = replacement[0];
            char newValue = replacement[1];
            text = text.replace(source, newValue);
            text = text.replace(Character.toUpperCase(source), Character.toUpperCase(newValue));
        }
        return text;
    }
}
