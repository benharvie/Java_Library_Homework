import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> bookCollection;

    public Borrower(){
        this.bookCollection = new ArrayList<>();
    }

    public int collectionCount() {
        return bookCollection.size();
    }

    public void collectBook(Book book) {
        bookCollection.add(book);
    }
}
