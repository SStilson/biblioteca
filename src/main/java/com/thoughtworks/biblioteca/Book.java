package com.thoughtworks.biblioteca;


import java.io.PrintStream;

public class Book {

    private String publishDate;
    private String author;
    private PrintStream printStream;
    private String title;

    public Book(PrintStream printStream, String title, String author, String publishDate) {
        this.printStream = printStream;
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
    }

    public void print() {
        this.printStream.println(this.title + " | " + this.author + " | " + this.publishDate);
    }
}
