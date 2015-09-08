package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setupStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void shouldDisplayBookListWhenDisplayIsCalled() {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Alchemist", "Paulo Coelho", 2006));
        books.add(new Book("Draclua", "Bram Stoker", 1998));
        books.add(new Book("Sixth Sense", "M Night", 1999));
        BookList bookList = new BookList(books);

        bookList.display();

        assertEquals("Title"+"\t"+"Author"+"\t"+"Year Of Publication"+"\n"+books.toString(), outContent.toString());
    }
}