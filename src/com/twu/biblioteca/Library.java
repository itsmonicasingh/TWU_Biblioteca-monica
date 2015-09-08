package com.twu.biblioteca;

import java.util.ArrayList;

//has a collection of books which it can display
public class Library {

    ArrayList<Book> bookList = new ArrayList<Book>();

    public Library(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public void display() {
        String columnHeader = "Title"+"\t"+"Author"+"\t"+"Year Of Publication"+"\n";
        System.out.print(columnHeader);
        System.out.print(bookList);
    }
}