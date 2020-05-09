package com.michal.basics.exercise1_10;

public class Book {
    private Long isbn;
    private String title;
    private BookStatus status;

    public Book(Long isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.status = BookStatus.AVAILABLE;
    }

    public Long getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
