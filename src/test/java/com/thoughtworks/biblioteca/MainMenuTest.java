package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MainMenuTest {

    private PrintStream printStream;
    private MainMenu menu;
    private Biblioteca biblioteca;
    private BufferedReader bufferedReader;

    @Before
    public void setUp()  {
        printStream = mock(PrintStream.class);
        biblioteca = mock(Biblioteca.class);
        menu = new MainMenu(printStream, biblioteca);
        bufferedReader = mock(BufferedReader.class);
    }

    @Test
    public void mainMenuTitleShouldDisplayWhenDisplayIsCalled() {
        menu.display();

        verify(printStream).println("Main Menu");
    }

    @Test
    public void listBooksOptionShouldDisplayWhenDisplayIsCalled() {
        menu.display();

        verify(printStream).println("1. List Books");
    }

    @Test
    public void shouldListBooksWhenUserInputIsOne() throws IOException {
        menu.display();
        when(bufferedReader.readLine()).thenReturn("1");

        verify(biblioteca).printBookList();

    }
}