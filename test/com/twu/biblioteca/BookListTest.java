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
        ArrayList<String> books = new ArrayList<String>();
        books.add("Alchemist");
        books.add("Dracula");
        books.add("Sixth Sense");
        BookList bookList = new BookList(books);

        bookList.display();

        assertEquals(books.toString(), outContent.toString());
    }
}