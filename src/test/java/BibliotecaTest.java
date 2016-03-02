import com.thoughtworks.biblioteca.Biblioteca;
import com.thoughtworks.biblioteca.Book;
import com.thoughtworks.biblioteca.MainMenu;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import static org.mockito.Mockito.*;

/**
 * Created by Adam on 3/1/16.
 */
public class BibliotecaTest {

    private Biblioteca biblioteca;
    private PrintStream printStream;
    private ArrayList<Book> bookList;
    private MainMenu menu;

    @Before
    public void setUp() {
        this.printStream = mock(PrintStream.class);
        this.bookList = new ArrayList<Book>();
        this.menu = mock(MainMenu.class);
        this.biblioteca = new Biblioteca(printStream, bookList, menu);
    }

    @Test
    public void shouldPrintWelcomeMessageWhenStarted() {
        biblioteca.printWelcomeMessage();
        verify(printStream).println("Welcome to Biblioteca");
    }

    @Test
    public void shouldPrintOneBookWhenLibraryHasOneBook() {
        Book book1 = mock(Book.class);

        bookList.add(book1);

        biblioteca.printBookList();

        verify(book1).print();
    }

    @Test
    public void shouldPrintTwoBooksWhenLibraryHasTwoBooks(){
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);

        bookList.add(book1);
        bookList.add(book2);

        biblioteca.printBookList();

        verify(book2).print();
    }

    @Test
    public void shouldDisplayMenu() {
        biblioteca.displayMainMenu();

        verify(menu).display();
    }

}