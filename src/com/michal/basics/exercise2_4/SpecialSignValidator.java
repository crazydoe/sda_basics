package com.michal.basics.exercise2_4;

public class SpecialSignValidator {

    public boolean isValid(String password) {

        char[] chars = password.toCharArray();
        for (char aChar : chars) {
            if (!Character.isLetter(aChar) && !Character.isDigit(aChar)) {
                return true;
            }
        }
        return false;
    }

}
