package com.twu.biblioteca;

import java.util.ArrayList;

//has a collection of books which it can display with the book details
public class Library {

    ArrayList<Book> bookList = new ArrayList<Book>();

    public Library(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        String bookDetails = String.format("%-30s%-30s%-20s\n", "Title", "Author", "Year Of Publication");
        for (Book book : bookList)
            bookDetails += book.toString();
        return bookDetails;
    }
}