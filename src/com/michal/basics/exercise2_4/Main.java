package com.michal.basics.exercise2_4;

public class Main {

    public static void main(String... args) {
        PasswordValidator validator = new PasswordValidator();

        String password = "suabeHaslo";
        System.out.println(validator.validate(password));

        password = "srednieHaslo1";
        System.out.println(validator.validate(password));


        password = "uberSuperHaslo1#$";
        System.out.println(validator.validate(password));

    }
}
