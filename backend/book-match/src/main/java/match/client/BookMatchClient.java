package match.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public final class BookMatchClient {

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
		
		boolean bookMatches = false;
		for (BooksToMatch bookToMatch : BooksToMatch.values()) {
			
			
			//***  Implement the book matching logic
//			bookMatches = ??? 
			//***  
			
			System.out.println(bookToMatch.getTitle() + ": Exists ->" + bookMatches);
		}
		
	}
	
}
