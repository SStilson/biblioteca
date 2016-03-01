import com.thoughtworks.biblioteca.Biblioteca;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.mockito.Mockito.* ;

/**
 * Created by Adam on 3/1/16.
 */
public class BibliotecaTest {

    private Biblioteca biblioteca ;
    private PrintStream printStream ;
    private ArrayList<String> books;

    @Before
    public void setUp() {
        this.printStream = mock(PrintStream.class) ;
        this.books = new ArrayList<String>();
        this.biblioteca = new Biblioteca(printStream, books) ;
    }

    @Test
    public void shouldPrintWelcomeMessageWhenStarted() {
        biblioteca.printWelcomeMessage();
        verify(printStream).println("Welcome to Biblioteca");
    }

    @Test
    public void shouldPrintBookNamesWhenCustomerRequests() {
        ArrayList<String> books = new ArrayList<String>();
        books.add("book");
        Biblioteca library = new Biblioteca(printStream, books);

        library.printBookList();

        verify(printStream).println(contains("book"));
    }
}