import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }
    public int bookCount() {
        return books.size();
    }

    public void addBook(Book book) {
        if (this.bookCount() < capacity) {
            books.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }
}
