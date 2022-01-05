import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        borrower = new Borrower("Bob");
        book1 = new Book("Harry Potter", "JK Rowling", "Fantasy Fiction");
        book2 = new Book("Lord of the Rings", "JRR Tolkein", "Fantasy Fiction");
        book3 = new Book("A Tale of Two Cities", "Charles Dickens", "Historical Novel");
    }

    @Test
    public void hasName() {
        assertEquals("Bob", borrower.getName());
    }

    @Test
    public void hasBookCollection() {
        borrower.addBook(book1);
        assertEquals(1, borrower.bookCount());
    }


}
