package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {

    @Test
    public void shouldStartApplicationAndDisplayWelcomeMessageAndListOfBooksInTheLibrary() {
        WelcomeMessage mockWelcome = mock(WelcomeMessage.class);
        Library mockBookList = mock(Library.class);
        BibliotecaApp biblioteca = new BibliotecaApp(mockWelcome, mockBookList);

        biblioteca.startApp();

        verify(mockWelcome).display();
        verify(mockBookList).display();
    }
}