package match.dao;

import java.util.List;

import match.model.Book;

public interface BookDao {

	List<Book> fetchBookList();
}
