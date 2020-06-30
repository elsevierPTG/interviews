package com.nixsolutions.matcher.dao;

import com.nixsolutions.matcher.model.Book;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BookDaoImpl implements BookDao {

	@Autowired
	public SessionFactory sessionFactory;

	@Override
	public List<Book> fetchBookList() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Book");
		return query.list();
	}

	@Override
	public List<Book> fetchBookByTitleKeywords(List<String> words) {
		Session session = sessionFactory.getCurrentSession();

		StringBuilder queryString = new StringBuilder().append("from Book b where ");
		for (int i = 0; i < words.size(); i++) {
			queryString.append("lower(b.bookTitle) like ?");
			if (i != words.size() - 1) {
				queryString.append(" and ");
			}
		}

		Query query = session.createQuery(queryString.toString());

		for (int i = 0; i < words.size(); i++) {
			query.setString(i, "%" + words.get(i) + "%");
		}

		return query.list();
	}

	SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
