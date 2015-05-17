import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void myBookTest()
    {
        String bookAuthor = "Tolkien";
        String expected = "Tolkien";
        Book myBook = new BookImpl("Hobbit", bookAuthor);
        String output = myBook.getAuthor();
        assertEquals(output, expected);
    }
}

