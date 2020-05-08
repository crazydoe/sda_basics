package com.michal.basics.exercise1_3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalendarOperations {

    public static void main(String... args) {
        System.out.print("Podaj datę urodzenia: (RRRR MM DD) ");

        Scanner scanner = new Scanner(System.in);
        String birthDate = scanner.nextLine();
        birthDate = birthDate.replace(" ", "");

        LocalDate now = LocalDate.now();
        LocalDate userBirthDate = LocalDate.parse(birthDate, DateTimeFormatter.BASIC_ISO_DATE);

        Period between = Period.between(userBirthDate, now);
        System.out.println("twój wiek to: " + between.getYears());

        LocalDate yearStart = LocalDate.of(now.getYear(), Month.JANUARY, 1);
        LocalDate yearEnd = LocalDate.of(now.getYear(), Month.DECEMBER, 31);

        long fromStart = ChronoUnit.DAYS.between(yearStart, now);
        long toEnd = ChronoUnit.DAYS.between(now, yearEnd);

        System.out.println("Od początku roku minęło " + fromStart + " dni");
        System.out.println("Do końca roku pozostało " + toEnd + " dni");

    }

}
