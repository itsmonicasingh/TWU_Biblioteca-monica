package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DisplayTest {

    final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void cleanUpStream() {
        System.setOut(System.out);
    }

    @Test
    public void shouldDisplayAnyStringPassedToIt() {
        Display display = new Display("I will display any string that is passed to me");

        display.display();

        assertEquals("I will display any string that is passed to me", outputStream.toString());
    }
} 
