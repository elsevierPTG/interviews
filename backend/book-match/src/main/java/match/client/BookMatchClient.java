package match.client;

import match.dao.BookDao;
import match.dao.BookDaoImpl;
import match.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Component
public class BookMatchClient {


    @Autowired
    BookDao bookDao;

    public static void main(String[] args) {
        BookMatchClient bookMatchClient = startFramework();
        bookMatchClient.matchBooks();
    }

    static BookMatchClient startFramework() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
        return ac.getBean(BookMatchClient.class);
    }

    /*
     * Implement this method
     */

    @Transactional
    public void matchBooks() {

        boolean bookMatches = false;
        List<Book> listOfBooks = bookDao.fetchBookList();
        for (BooksToMatch bookToMatch : BooksToMatch.values()) {
            // iterate over all database entities for any possible match
            for (Book books : listOfBooks) {
                if (filterString(books.getBookTitle()).equals(filterString(bookToMatch.getTitle()))) {
                    bookMatches = true;
                }
            }
            System.out.println(bookToMatch.getTitle() + ": Exists ->" + bookMatches);
            bookMatches = false;
        }
    }

    //removes words from string that can be ignored. Coverts book title in characters that possibly can match in database
    public String filterString(final String word) {
        return word.toLowerCase().replaceAll("\\b( ?'s|of|in|the|and|:|'| )\\b|[_\\W]", "");
    }

}
