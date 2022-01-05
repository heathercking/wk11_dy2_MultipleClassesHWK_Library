import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower("Bob");
        book1 = new Book("Harry Potter", "JK Rowling", "Fantasy Fiction");
        book2 = new Book("Lord of the Rings", "JRR Tolkein", "Fantasy Fiction");
        book3 = new Book("A Tale of Two Cities", "Charles Dickens", "Historical Novel");
        library = new Library(2);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", borrower.getName());
    }

    @Test
    public void hasBookCollection() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canAddBookToCollection() {
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        borrower.borrowBookFromLibrary(library, book1);
        assertEquals(1, library.countBooks());
        assertEquals(1, borrower.bookCount());
    }


}
