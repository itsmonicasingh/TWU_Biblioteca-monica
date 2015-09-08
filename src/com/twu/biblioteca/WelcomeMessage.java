package com.twu.biblioteca;

// WelcomeMesssage takes a WelcomeMessage and displays it
public class WelcomeMessage {

    private String welcomeMessage;

    public WelcomeMessage(String message) {
        this.welcomeMessage = message;
    }

    public void display() {
        System.out.print(welcomeMessage);
    }
}