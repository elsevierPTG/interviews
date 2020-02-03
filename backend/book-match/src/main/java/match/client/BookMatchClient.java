package match.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import match.dao.BookDao;
import match.model.Book;

@Component
public final class BookMatchClient {
	@Autowired
	private BookDao bookDao;
	
	public static void main(String[] args) {
		BookMatchClient bookMatchClient = startFramework();
		List<Book> bookList = bookMatchClient.fetchBookList();
		Set<String> bookTitles = bookMatchClient.normalizeTitles(bookList);
		List<String> titlesToMatch = bookMatchClient.getTitlesToMatch();
		List<String> matchedTitles = bookMatchClient.matchBooks(bookTitles, titlesToMatch);
	}

	public List<String> matchBooks(Set<String> bookTitles, List<String> titlesToMatch) {
		String normalizedTitle;		
		boolean bookMatches = false;
		List<String> matchedTitles = new ArrayList<String>();
		for (String title : titlesToMatch) {		
			normalizedTitle = normalize(title);
			System.out.println("'" + normalizedTitle + "'");
			bookMatches = bookTitles.contains(normalizedTitle);	
			if (bookMatches) {
				matchedTitles.add(title);
			}
			System.out.println(title + ": Exists ->" + bookMatches);
		}
		return matchedTitles;
	}

	static BookMatchClient startFramework() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
		return ac.getBean(BookMatchClient.class);
	}

	private List<Book> fetchBookList() {
		List<Book> bookList = bookDao.fetchBookList();
		return bookList;
	}
	
	private List<String> getTitlesToMatch() {
		List<String> titlesToMatch = new ArrayList<String>();
		for(BooksToMatch bookToMatch : BooksToMatch.values()) {
			titlesToMatch.add((String)bookToMatch.getTitle());
		}
		return titlesToMatch;
	}

	Set<String> normalizeTitles(List<Book> bookList) {
		String title;
		String normalizedTitle;	
		Set<String> bookTitles = new HashSet<String>();
		for(Book bookFromList : bookList) {
			title = bookFromList.getBookTitle();
			normalizedTitle = normalize(title);
			bookTitles.add(normalizedTitle);
			System.out.println("'" + title + "' -> '" + normalizedTitle + "'");
		}
		System.out.println("");
		return bookTitles;
	}

	private String normalize(String bookTitle) {
		bookTitle = bookTitle.trim().toLowerCase();
		bookTitle = bookTitle.replaceAll("\\s+", " ");
		bookTitle = bookTitle.replaceAll("\\p{Punct}", "");
		bookTitle = bookTitle.replaceAll("\\s+the\\s+|\\s+the$|^the\\s+", " ");
		bookTitle = bookTitle.replaceAll("\\s+in\\s+|\\s+in$|^in\\s+", " ");
		bookTitle = bookTitle.replaceAll("\\s+of\\s+|\\s+of$|^of\\s+", " ");
		bookTitle = bookTitle.replaceAll("\\s+and\\s+|\\s+and$|^and\\s+", " ");
		return bookTitle;
	}
}
