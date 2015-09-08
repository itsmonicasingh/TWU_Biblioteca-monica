package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class MainMenuTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setupStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void shouldDisplayOptionsWhichAreAvalilabeToTheUserInTheMainMenu() {
        ArrayList<String> userOptions = new ArrayList<String>();
        userOptions.add("1. List Of Books In The Library");
        MainMenu mainMenu = new MainMenu(userOptions);

        mainMenu.displayUserOptions();

        assertEquals("1. List Of Books In The Library\n", outContent.toString());
    }
}