package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldDisplayBookDetailsLikeTitleAuthorYeayOfPublication() {
        Book book = new Book("Alchemist", "Paulo Coelho", 2006);

        assertEquals("Alchemist"+"\t"+"Paulo Coelho"+"\t"+"2006", book.toString());
    }
}