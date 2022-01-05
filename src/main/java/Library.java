import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> bookCollection;
    private HashMap<String, Integer> genres;

    public Library(int capacity) {
        this.capacity = capacity;
        this.bookCollection = new ArrayList<Book>();
        this.genres = new HashMap<String, Integer>();
    }

    public int countBooks() {
        return bookCollection.size();
    }

    public void addBookToCollection(Book book) {
        if (isStockFull()) {
            this.bookCollection.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean isStockFull() {
        if (countBooks() >= this.capacity) {
            return false;
        }
        return true;
    }

    public Book removeBookFromCollection(Book book) {
        Book borrowedBook = null;
        if (this.countBooks() > 0) {
            borrowedBook = this.bookCollection.remove(0);
        }
        return borrowedBook;
//        this.bookCollection.remove(book);
    }

    public void countBooksByGenre() {
        for (Book book : this.bookCollection) {
            Integer currentValue = this.genres.get(book.getGenre()); // comes back null if doesn't exist
            if (currentValue == null) {
                this.genres.put(book.getGenre(), 1);
            } else {
                this.genres.put(book.getGenre(), currentValue + 1); // this should overwrite existing key:value pair
            }
        }

    }
}