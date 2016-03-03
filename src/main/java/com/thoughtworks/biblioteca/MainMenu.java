package com.thoughtworks.biblioteca;


import java.io.PrintStream;

public class MainMenu {


    private PrintStream printStream;
    private Biblioteca biblioteca;

    public MainMenu(PrintStream printStream, Biblioteca biblioteca) {
        this.printStream = printStream;
        this.biblioteca = biblioteca;
    }

    public void display() {
        printStream.println("Main Menu");
        printStream.println("1. List Books");

        biblioteca.printBookList();
    }
}
