package com.twu.biblioteca;

public class BibliotecaApp {
    WelcomeMessage welcomeMessage;
    Library bookList;

    public BibliotecaApp(WelcomeMessage welcomeMessage, Library bookList) {
        this.welcomeMessage = welcomeMessage;
        this.bookList = bookList;
    }

}
