package match.client;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import match.model.Book;

public class BookMatchClientTest {
	private BookMatchClient bookMatchClient = null;

	@Before
	public void setUp() throws Exception {
		bookMatchClient = new BookMatchClient();
	}

	@After
	public void tearDown() throws Exception {
		bookMatchClient = null;
	}

	@Test
	public void normalizeTitles_capitalization_convertedToLowerCase() {
		Book uppercaseTitle = new Book();
		uppercaseTitle.setBookTitle("UPPERCASE TITLE");
		Book mixedcaseTitle = new Book();
		mixedcaseTitle.setBookTitle("Mixedcase Title");
		List<Book> bookList = Arrays.asList(uppercaseTitle, mixedcaseTitle);
		
		Set<String> bookTitles = bookMatchClient.normalizeTitles(bookList);
		assert(bookTitles.size() == 2);
		assert(bookTitles.contains("uppercase title"));
		assert(bookTitles.contains("mixedcase title"));
	}


	@Test
	public void normalizeTitles_noiseWords_ignored() {
		Book title = new Book();
		title.setBookTitle("The Noise Words: The In Of And They Don't Make Sound");
		List<Book> bookList = Arrays.asList(title);
		
		Set<String> bookTitles = bookMatchClient.normalizeTitles(bookList);
		assert(bookTitles.size() == 1);
		assert(bookTitles.contains("noise words they dont make sound"));
	}
	
	@Test
	public void normalizeTitles_puntuationAndWhitespace_ignored() {
		Book title = new Book();
		title.setBookTitle("’!@#$%^&*();:,<.>/? Fun with    	Punctuation   ’!@#$%^&*();:,<.>/?");
		List<Book> bookList = Arrays.asList(title);
	
		Set<String> bookTitles = bookMatchClient.normalizeTitles(bookList);
		assert(bookTitles.size() == 1);
		assert(bookTitles.contains("fun with punctuation"));
	}
	
	
	@Test
	public void matchBooks_titleAbsent_noMatch() {
		Set<String> bookTitles = new HashSet<String>(Arrays.asList("real greys anatomy", 
				"measure our days a spiritual exploration illness",
				"fitzpatricks color atlas synopsis clinical dermatology seventh edition color atlas"));
		List<String> titlesToMatch = Arrays.asList("Algorithms to Live By: The Computer Science of Human Decisions");
		List<String> matchedTitles = bookMatchClient.matchBooks(bookTitles, titlesToMatch);
		assert(matchedTitles.size() == 0);
		assert(!matchedTitles.contains("Algorithms to Live By: The Computer Science of Human Decisions"));
	}
	
	@Test
	public void matchBooks_titleExists_match() {
		Set<String> bookTitles = new HashSet<String>(Arrays.asList("real greys anatomy", 
				"measure our days a spiritual exploration illness",
				"fitzpatricks color atlas synopsis clinical dermatology seventh edition color atlas"));
		List<String> titlesToMatch = Arrays.asList("THE REAL GREY’!@#$%^&*();:,<.>/?S ANATOMY", 
				"The measure of our days: a spiritual exploration of in  illness",
				"Fitzpatrick's Color Atlas and Synopsis of Clinical Dermatology, 	Seventh Edition  ((Color Atlas))");
		List<String> matchedTitles = bookMatchClient.matchBooks(bookTitles, titlesToMatch);
		assert(matchedTitles.size() == 3);
		assert(matchedTitles.contains("THE REAL GREY’!@#$%^&*();:,<.>/?S ANATOMY"));
		assert(matchedTitles.contains("The measure of our days: a spiritual exploration of in  illness"));
		assert(matchedTitles.contains("Fitzpatrick's Color Atlas and Synopsis of Clinical Dermatology, 	Seventh Edition  ((Color Atlas))"));
	}
}
