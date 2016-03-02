package com.thoughtworks.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookTest {

    private PrintStream printStream;

    @Test
    public void print_shouldIncludeTitle() {
        printStream = mock(PrintStream.class);
        Book book = new Book(printStream, "Title", "Author", "PublishedDate");

        book.print();

        verify(printStream).println(contains("Title"));
    }

    @Test
    public void print_shouldIncludeAuthor() {
        printStream = mock(PrintStream.class);
        Book book = new Book(printStream, "Title", "Author", "PublishedDate");

        book.print();

        verify(printStream).println(contains("Author"));
    }

    @Test
    public void print_shouldIncludeDatePublished() {
        printStream = mock(PrintStream.class);
        Book book = new Book(printStream, "Title", "Author", "PublishedDate");

        book.print();

        verify(printStream).println(contains("PublishedDate"));
    }
}