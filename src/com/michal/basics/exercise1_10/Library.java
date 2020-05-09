package com.michal.basics.exercise1_10;

import java.util.Scanner;

public class Library {

    private Collection library;
    private Scanner scanner;

    public Library() {
        this.library = new Collection();
        this.scanner = new Scanner(System.in);
    }

    public void showBooks() {
        Book[] all = library.findAll();
        printBooks(all);
    }

    public void findByName() {
        System.out.print("Enter book name: ");
        String name = scanner.nextLine();

        Book[] allBooksByName = library.findAllBooksByName(name);
        printBooks(allBooksByName);
    }

    public void rentBook() {
        System.out.print("Enter isbn code: ");
        Long isbn = Long.parseLong(scanner.nextLine());

        Rent rent = library.rentBook(isbn);
        if (ActionStatus.SUCCESS.equals(rent.getActionStatus())) {
            System.out.println("Book \"" + rent.getBook().getTitle() + " rented");
        } else {
            if (rent.getBook() != null) {
                System.out.println("Book \"" + rent.getBook().getTitle() + " is " + rent.getBook().getStatus());
            } else {
                System.out.println("Book not found!");
            }
        }
    }

    public void returnBook() {
        System.out.print("Enter isbn code: ");
        Long isbn = Long.parseLong(scanner.nextLine());

        ActionStatus actionStatus = library.returnBook(isbn);
        if (ActionStatus.SUCCESS.equals(actionStatus)) {
            System.out.println("Book returned");
        } else {
            System.out.println("Cannot be returned");
        }
    }

    public void reportDamage() {
        System.out.print("Which book has been damaged? (ISBN): ");
        Long isbn = Long.parseLong(scanner.nextLine());
        ActionStatus actionStatus = library.reportDamage(isbn);

        if (ActionStatus.FAILURE.equals(actionStatus)) {
            System.out.println("ooops! something went wrong!");
        }
    }

    private void printBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book.getIsbn() + " " + book.getTitle() + " " + book.getStatus());
        }
    }
}
