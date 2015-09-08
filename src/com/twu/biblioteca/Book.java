package com.twu.biblioteca;

//Book has a title, author and year of publication
public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%-30s%-30s%-20s\n", this.title, this.author, this.year);
    }
}