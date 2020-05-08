package com.michal.basics.exercise2_4;

public class BigLetterValidator {

    public boolean isValid(String password) {
        char[] chars = password.toCharArray();
        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                return true;
            }
        }
        return false;
    }
}
