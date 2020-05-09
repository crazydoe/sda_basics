package com.michal.basics.exercise1_10;

import java.util.Arrays;

public class Collection {

    private Book[] books = {
            new Book(123L, "Some title"),
            new Book(133L, "Some title"),
            new Book(223L, "Another title"),
            new Book(323L, "Dumb title"),
            new Book(333L, "Dumb title"),
            new Book(343L, "Dumb title"),
            new Book(423L, "Shit title"),
            new Book(523L, "WTF title"),
            new Book(623L, "?? title")
    };

    public Book[] findAll() {
        return books;
    }

    public Book[] findAllBooksByName(String title) {
        int foundSize = 0;
        Book[] found = new Book[books.length];
        for (Book book : books) {
            String lowerdTittle = book.getTitle().toLowerCase();
            title = title.toLowerCase();
            if (lowerdTittle.contains(title)) {
                found[foundSize++] = book;
            }
        }
        return Arrays.copyOfRange(found, 0, foundSize);
    }

    public Rent rentBook(Long isbn) {
        Book bookByISBN = findBookByISBN(isbn);
        if (bookByISBN == null) {
            return new Rent(ActionStatus.FAILURE, null);
        }
        if (BookStatus.AVAILABLE.equals(bookByISBN.getStatus())) {
            bookByISBN.setStatus(BookStatus.RENTED);
            return new Rent(ActionStatus.SUCCESS, bookByISBN);
        }
        return new Rent(ActionStatus.FAILURE, bookByISBN);
    }

    public ActionStatus returnBook(Long isbn) {
        Book bookByISBN = findBookByISBN(isbn);

        if (bookByISBN == null) {
            return ActionStatus.FAILURE;
        }
        if (BookStatus.AVAILABLE.equals(bookByISBN.getStatus())) {
            return ActionStatus.FAILURE;
        }
        if (BookStatus.DAMAGED.equals(bookByISBN.getStatus())) {
            return ActionStatus.FAILURE;
        }

        bookByISBN.setStatus(BookStatus.AVAILABLE);
        return ActionStatus.SUCCESS;
    }

    public ActionStatus reportDamage(Long isbn) {
        Book bookByISBN = findBookByISBN(isbn);
        if (bookByISBN == null) {
            return ActionStatus.FAILURE;
        }
        bookByISBN.setStatus(BookStatus.DAMAGED);
        return ActionStatus.SUCCESS;
    }

    private Book findBookByISBN(Long isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
