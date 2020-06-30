package com.nixsolutions.matcher.dao;

import com.nixsolutions.matcher.model.Book;

import java.util.List;

public interface BookDao {

	List<Book> fetchBookList();
	List<Book> fetchBookByTitleKeywords(List<String> words);

}
