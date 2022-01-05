import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("Harry Potter", "JK Rowling", "Fantasy Fiction");
    }

    @Test
    public void hasTitle() {
        assertEquals("Harry Potter", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("JK Rowling", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Fantasy Fiction", book.getGenre());
    }


}
