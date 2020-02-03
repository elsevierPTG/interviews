package match.dao;

import java.util.List;

import match.model.Book;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Book> fetchBookList() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Book");
		return query.list();
	}

	SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
