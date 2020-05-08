package com.michal.basics.exercise2_4;

public class LetterValidator {

    public boolean isValid(String password) {
        char[] chars = password.toCharArray();
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                return true;
            }
        }

        return false;
    }
}
