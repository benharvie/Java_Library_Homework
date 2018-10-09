import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Harry Potter", "JK Rowling", "Fantasy");
    }

    @Test
    public void borrowerStartsWithNoCollection(){
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void addBookToCollection(){
        borrower.collectBook(book);
        assertEquals(1, borrower.collectionCount());
    }
}
