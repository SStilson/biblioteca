package com.thoughtworks.biblioteca;

import java.util.ArrayList;

/**
 * Created by Adam on 3/1/16.
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(System.out, new ArrayList<String>());
        biblioteca.printWelcomeMessage();
        biblioteca.printBookList();
    }
}
