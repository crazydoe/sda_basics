package com.michal.basics.exercise1_4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PESELReader {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        String pesel = scanner.nextLine();
        LocalDate birthDay = parse(pesel);
        System.out.println(birthDay);
        LocalDate now = LocalDate.now();

        Period between = Period.between(birthDay, now);
        System.out.println("Wiek: " + between.getYears());
    }

    public static LocalDate parse(String pesel) {
        String date = pesel.substring(0, 6);
        LocalDate birthDay = LocalDate.parse("19" + date, DateTimeFormatter.BASIC_ISO_DATE);
        return birthDay;
    }

}
