import org.junit.Before;
import org.junit.Test;

import javax.naming.LinkRef;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("Harry Potter", "JK Rowling", "Fantasy Fiction");
        book2 = new Book("Lord of the Rings", "JRR Tolkein", "Fantasy Fiction");
        book3 = new Book("A Tale of Two Cities", "Charles Dickens", "Historical Novel");
    }

    @Test
    public void hasBookCollection() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToBookCollection() {
        library.addBookToCollection(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void hasBookCapacity() {
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void canNotAddBookIfNoCapacity() {
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        library.addBookToCollection(book3);
        assertEquals(2, library.countBooks());
    }

}
