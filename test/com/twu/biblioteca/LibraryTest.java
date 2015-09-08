package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class LibraryTest {

    @Test
    public void shouldReturnTheBookDetailsOfTheBooksInTheLibrary() {
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("Alchemist", "Paulo Coelho", 2006));
        listOfBooks.add(new Book("Dracula", "Bram Stoker", 1998));
        listOfBooks.add(new Book("Sixth Sense", "M Night", 1999));
        Library library = new Library(listOfBooks);

        assertEquals(String.format("%-30s%-30s%-20s\n", "Title", "Author", "Year Of Publication") +
                String.format("%-30s%-30s%-20s\n", "Alchemist", "Paulo Coelho", 2006) +
                String.format("%-30s%-30s%-20s\n", "Dracula", "Bram Stoker", 1998) +
                String.format("%-30s%-30s%-20s\n", "Sixth Sense", "M Night", 1999), library.toString());
    }
}