package com.twu.biblioteca;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public int readInput() {
        return scanner.nextInt();
    }
}