import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> bookCollection;

    public Library(int capacity) {
        this.capacity = capacity;
        this.bookCollection = new ArrayList<Book>();
    }

    public int countBooks() {
        return bookCollection.size();
    }

    public void addBookToCollection(Book book) {
        this.bookCollection.add(book);
    }

    public int getCapacity() {
        return this.capacity;
    }

}
