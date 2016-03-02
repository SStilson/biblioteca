package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Book> bookList;
    private MainMenu menu;
    private PrintStream printStream ;


    public Biblioteca(PrintStream printStream, ArrayList<Book> bookList, MainMenu menu) {
        this.printStream = printStream;
        this.bookList = bookList;
        this.menu = menu;
    }

    public void printWelcomeMessage() {
        printStream.println("Welcome to Biblioteca") ;
    }

    public void printBookList() {
        for (Book book : bookList) {
            book.print();
        }
    }

    public void displayMainMenu() {
        this.menu.display();
    }
}
