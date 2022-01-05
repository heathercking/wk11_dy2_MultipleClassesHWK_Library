import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int bookCount() {
        return this.borrowedBooks.size();
    }

    public void borrowBookFromLibrary(Library library, Book book) {
        Book borrowedBook = library.removeBookFromCollection(book);
        this.borrowedBooks.add(borrowedBook);
    }



}
