import com.thoughtworks.biblioteca.Biblioteca;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.* ;

/**
 * Created by Adam on 3/1/16.
 */
public class BibliotecaTest {

    private Biblioteca biblioteca ;
    private PrintStream printStream ;

    @Before
    public void setUp() {
        this.printStream = mock(PrintStream.class) ;
        this.biblioteca = new Biblioteca(printStream) ;
    }

    @Test
    public void shouldPrintWelcomeMessageWhenStarted() {
        biblioteca.printWelcomeMessage();
        verify(printStream).println("Welcome to Biblioteca");
    }
}