package match.client;

import match.dao.BookDao;
import match.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public final class BookMatchClient {

	@Autowired
	private BookDao bookDao;

	public BookMatchClient() {
	}

	public BookMatchClient(BookDao bookDao) {
		this.bookDao = bookDao;
	}

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
	public void matchBooks() {
		ArrayList<Book> bookArrayList = (ArrayList<Book>) bookDao.fetchBookList();

		boolean bookMatches = false;
		for (BooksToMatch bookToMatch : BooksToMatch.values()) {

			String bookTitle = bookToMatch.getTitle();
			Pattern stopWords = Pattern.compile("\\b(?:i|the|of|and|in)\\b\\s*", Pattern.CASE_INSENSITIVE);


			bookTitle = bookTitle.replaceAll("\\p{Punct}","");

			Matcher matcher = stopWords.matcher(bookTitle);
			String cleanBookTitle = matcher.replaceAll("");

			for (Book book : bookArrayList) {
				if (book.getBookTitle().equalsIgnoreCase(cleanBookTitle)) {
					bookMatches = true;
					break;
				}

			}


			System.out.println(bookToMatch.getTitle() + ": Exists ->" + bookMatches);
		}
		
	}
	
}
