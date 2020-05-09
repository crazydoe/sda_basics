package com.michal.basics.exercise1_10;

public class Rent {

    private Book book;
    private ActionStatus actionStatus;

    public Rent(ActionStatus actionStatus, Book book) {
        this.book = book;
        this.actionStatus = actionStatus;
    }

    public Book getBook() {
        return book;
    }

    public ActionStatus getActionStatus() {
        return actionStatus;
    }
}
