package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class UserInputTest {

    @Test
    public void shouldReturnTheInputEnteredByTheUser() {
        String input = "1. List Of Books In The Library";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);

        assertEquals("1. List Of Books In The Library", userInput.read());
    }
}