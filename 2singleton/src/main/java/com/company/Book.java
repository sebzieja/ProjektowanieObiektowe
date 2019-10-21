package com.company;

public class Book {
    Long id;
    String title;
    String author;
    String userId;

    public Book(Long id, String title, String author, String userId) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return id + "," + title + "," + author + "," + userId;
    }
}
