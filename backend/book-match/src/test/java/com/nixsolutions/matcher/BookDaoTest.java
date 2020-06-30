package com.nixsolutions.matcher;

import com.nixsolutions.matcher.dao.BookDao;
import com.nixsolutions.matcher.model.Book;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class BookDaoTest {

    private BookDao bookDao;
    private JdbcDatabaseTester tester;

    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Before
    public void setup() throws Exception {
        tester = new JdbcDatabaseTester("org.hsqldb.jdbcDriver",
                "jdbc:hsqldb:mem:feed");

        tester.setDataSet(new FlatXmlDataSetBuilder().build(getClass()
                .getResourceAsStream("/data_set.xml")));
        tester.setSetUpOperation(DatabaseOperation.CLEAN_INSERT);
        tester.onSetup();
        tester.setTearDownOperation(DatabaseOperation.DELETE_ALL);
    }

    @Test
    public void fetchBookByTitleKeywords() {
        List<Book> books = bookDao.fetchBookByTitleKeywords(
                Arrays.asList("andrews", "diseases", "skin", "clinical",
                        "dermatology"));
        assertEquals(1, books.size());
        assertEquals("Andrews' Diseases of the Skin: Clinical Dermatology",
                books.get(0).getBookTitle());
    }

}
