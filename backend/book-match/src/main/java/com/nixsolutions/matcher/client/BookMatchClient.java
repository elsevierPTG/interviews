package com.nixsolutions.matcher.client;

import com.nixsolutions.matcher.dao.BookDao;
import com.nixsolutions.matcher.utils.TitleHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public final class BookMatchClient {

	private BookDao bookDao;
	private TitleHandler titleHandler;
	private static final String[] STOP_WORDS = { "the", "in", "of", "and" };

	@Autowired
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Autowired
	public void setTitleHandler(TitleHandler titleHandler) {
		this.titleHandler = titleHandler;
	}

	public static void main(String[] matchBooks) {
		BookMatchClient bookMatchClient = startFramework();
		bookMatchClient.matchBooks();
	}
	
	private static BookMatchClient startFramework() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"/applicationContext.xml");
		return ac.getBean(BookMatchClient.class);
	}

	private void matchBooks() {
		BooksToMatch[] booksToMatch = BooksToMatch.values();

		for (BooksToMatch book : booksToMatch) {
			boolean match = titleHandler.consistTitle(
					bookDao.fetchBookByTitleKeywords(
							titleHandler.extractKeyWords(book.getTitle())),
					book.getTitle());
			System.out.printf("%s: Exists ->%s\n", book.getTitle(), match);
		}
	}

}
