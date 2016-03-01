package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Adam on 3/1/16.
 */
public class Biblioteca {

    private PrintStream printStream ;
    private ArrayList<String> books;

    /*public Biblioteca(PrintStream printStream) {
        this.printStream = printStream ;
        this.books = new ArrayList<String>();
    }*/

    public Biblioteca(PrintStream printStream, ArrayList<String> bookList) {
        this.printStream = printStream ;
        this.books = bookList;
    }

    public void printWelcomeMessage() {
        printStream.println("Welcome to Biblioteca") ;
    }

    public void printBookList() {
        for (String book : books) {
            printStream.println(book);
        }
    }
}
