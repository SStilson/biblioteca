package com.thoughtworks.biblioteca;

import java.io.PrintStream;

/**
 * Created by Adam on 3/1/16.
 */
public class Biblioteca {

    private PrintStream printStream ;

    public Biblioteca(PrintStream printStream) {
        this.printStream = printStream ;
    }

    public void printWelcomeMessage() {
        //System.out.println("Welcome to Biblioteca") ;
    }
}
