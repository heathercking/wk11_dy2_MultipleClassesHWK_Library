import org.junit.Before;
import org.junit.Test;

import javax.naming.LinkRef;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(2);
        book = new Book("Harry Potter", "JK Rowling", "Fantasy Fiction");
    }

    @Test
    public void hasBookCollection() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToBookCollection() {
        library.addBookToCollection(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void hasBookCapacity() {
        assertEquals(2, library.getCapacity());
    }

}
