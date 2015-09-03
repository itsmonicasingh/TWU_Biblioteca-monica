package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBibliotecaApp {

    @Test
    public void shouldReturnWelcomeMessage() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        assertEquals("Welcome to Bangalore Public Library", bibliotecaApp.display());
    }
}
