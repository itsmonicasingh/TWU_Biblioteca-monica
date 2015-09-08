package com.twu.biblioteca;

public class Display {
    private String message;

    public Display(String message) {
        this.message = message;
    }

    public void message() {
        System.out.print(message);
    }
}