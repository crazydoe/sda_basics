package com.michal.basics.exercise1_10;

import java.util.Scanner;

public class Test {

    public static void main(String... args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("1. Show all books");
            System.out.println("2. Find a book");
            System.out.println("3. Rent a book");
            System.out.println("4. Return a book");
            System.out.println("5. Report damaged book");
            System.out.println("6. Leave library");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    library.findByName();
                    break;
                case 3:
                    library.rentBook();
                    break;
                case 4:
                    library.returnBook();
                    break;
                case 5:
                    library.reportDamage();
            }
        } while (choose != 6);
    }
}
