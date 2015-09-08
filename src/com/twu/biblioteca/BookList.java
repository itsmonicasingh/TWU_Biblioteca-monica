package com.twu.biblioteca;

import java.util.ArrayList;

//has a list of books which it can display
public class BookList {

    ArrayList<String> bookList = new ArrayList<String>();

    public BookList(ArrayList<String> bookList) {
        this.bookList = bookList;
    }

    public void display() {
        System.out.print(bookList);
    }
}