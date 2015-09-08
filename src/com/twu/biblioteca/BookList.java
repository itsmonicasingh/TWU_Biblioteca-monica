package com.twu.biblioteca;

import java.util.ArrayList;

//has a list of books which it can display
public class BookList {

    ArrayList<Book> bookList = new ArrayList<Book>();

    public BookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public void display() {
        String columnHeader = "Title"+"\t"+"Author"+"\t"+"Year Of Publication"+"\n";
        System.out.print(columnHeader);
        System.out.print(bookList);
    }
}