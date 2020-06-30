package com.nixsolutions.matcher;

import com.nixsolutions.matcher.client.BooksToMatch;
import com.nixsolutions.matcher.model.Book;
import com.nixsolutions.matcher.utils.TitleHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TitleHandlerTester {

    private TitleHandler titleHandler;

    @Autowired
    public void setTitleHandler(TitleHandler titleHandler) {
        this.titleHandler = titleHandler;
    }

    @Test
    public void testConsistTitle() {
        Book book1 = new Book();
        book1.setBookTitle("Andrews' Diseases of the Skin: Clinical Dermatology");

        Book book2 = new Book();
        book2.setBookTitle("Good Night Moon");

        List<Book> books = Arrays.asList(book1, book2);

        assertTrue(titleHandler.consistTitle(
                books, "andrews diseases skin clinical dermatology"));
    }

    @Test
    public void testGetNormalizeTitle() {
        assertEquals("andrews diseases skin clinical dermatology",
                titleHandler.getNormalizedTitle(
                        "Andrews' Diseases of the Skin: Clinical Dermatology"));
    }

    @Test
    public void testGetKeyWords() {
        BooksToMatch[] booksToMatchValues = BooksToMatch.values();
        List<BooksToMatch> booksToMatch = Arrays.asList( booksToMatchValues[0],
                booksToMatchValues[1] );
        List<String> expected = Arrays.asList("andrews", "diseases", "skin",
                "clinical", "dermatology");

        assertEquals(expected, titleHandler.extractKeyWords(
                "Andrews' Diseases of the Skin: Clinical Dermatology"));
    }

}
