package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PrintStream printStream = System.out;
        MainMenu menu = new MainMenu(printStream, biblioteca);
        Biblioteca biblioteca = new Biblioteca(printStream, books(printStream), menu);
        biblioteca.printWelcomeMessage();
        biblioteca.displayMainMenu();
        biblioteca.printBookList();

    }

    private static ArrayList<Book> books(PrintStream printStream) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book(printStream, "Title","author","publishDate"));
        bookList.add(new Book(printStream, "Sabriel","Garth Nix","1990"));
        return bookList;
    }
}
