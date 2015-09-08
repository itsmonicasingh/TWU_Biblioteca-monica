package com.twu.biblioteca;

//Book has a title, author and year of publication
public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.title = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return title +"\t"+author+"\t"+year;
    }
}