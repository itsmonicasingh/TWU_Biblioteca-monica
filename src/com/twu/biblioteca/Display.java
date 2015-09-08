package com.twu.biblioteca;

public class Display {
    private String message;

    public Display(String message) {
        this.message = message;
    }

    public void display() {
        System.out.print(message);
    }
}