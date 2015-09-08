package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class UserInputTest {

    @Test
    public void shouldReturnTheCorrectInput() {
        String userChoice = "1";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(userChoice.getBytes());
        System.setIn(inContent);
        Scanner scanner = new Scanner(System.in);
        UserInput inputUnit = new UserInput(scanner);

        assertEquals(1, inputUnit.readInput());
    }
}