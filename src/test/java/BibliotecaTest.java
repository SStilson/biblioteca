import com.thoughtworks.biblioteca.Biblioteca;
import org.junit.Before;

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
        this.biblioteca = new Biblioteca(System.out) ;
        this.printStream = mock(PrintStream.class) ;
    }

    public void testWelcomeMessage() {
        biblioteca.printWelcomeMessage();
    }
}