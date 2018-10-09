import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(3);
        book = new Book("Harry Potter", "JK Rowling", "Fantasy");
    }

    @Test
    public void bookCountStartsAtZero(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addsNewBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void hitsCapacity() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.bookCount());
    }

}
