package com.michal.basics.exercise2_4;

public class NumberValidator {

    public boolean isValid(String password) {
        char[] chars = password.toCharArray();
        for (char aChar : chars) {
            if(Character.isDigit(aChar)) {
                return true;
            }
        }
        return false;
    }
}
