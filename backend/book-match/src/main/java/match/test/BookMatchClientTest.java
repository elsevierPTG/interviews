package match.test;

import match.client.BookMatchClient;
import match.dao.BookDao;
import match.model.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class BookMatchClientTest {

    @InjectMocks
    BookMatchClient bookMatchClient;

    @Mock
    BookDao bookDao;

    private final String bookTitle = "the test of the and :";
    private final String expected = "test";

    @Test
    public void matchBooksTest() {

        boolean bookMatch = false;
        List<Book> bookList = new ArrayList<>();
        Book book = new Book();
        book.setBookTitle("testTitle");
        book.setBookAuthor("testAuthor");
        book.setId(1l);
        bookList.add(book);
        Mockito.when(bookDao.fetchBookList()).thenReturn(bookList);
        bookMatchClient.matchBooks();
        String actual = bookMatchClient.filterString(bookTitle);
        Assert.assertEquals(expected, actual);
    }
}
