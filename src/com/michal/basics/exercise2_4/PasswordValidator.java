package com.michal.basics.exercise2_4;

public class PasswordValidator {

    private BigLetterValidator bigLetterValidator = new BigLetterValidator();
    private NumberValidator numberValidator = new NumberValidator();
    private SpecialSignValidator specialSignValidator = new SpecialSignValidator();
    private LetterValidator letterValidator = new LetterValidator();

    public boolean validate(String password) {
        password = password.trim();

        boolean[] results = new boolean[4];
        results[0] = bigLetterValidator.isValid(password);
        results[1] = numberValidator.isValid(password);
        results[2] = specialSignValidator.isValid(password);
        results[3] = letterValidator.isValid(password);

        int validationScore = 0;
        for (boolean result : results) {
            validationScore += result ? 1 : 0;
        }
        return validationScore >= 3;
    }
}
