package com.nixsolutions.matcher.utils;

import com.nixsolutions.matcher.model.Book;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class TitleHandler {

    private static final String[] STOP_WORDS = { "the", "in", "of", "and" };

    public boolean consistTitle(List<Book> books, String title) {
        for (Book book : books) {
            if (getNormalizedTitle(book.getBookTitle()).equals(getNormalizedTitle(title))) {
                return true;
            }
        }
        return false;
    }

    public List<String> extractKeyWords(String title) {
        title = getNormalizedTitle(title);
        return Arrays.asList(title.split("\\s"));
    }

    public String getNormalizedTitle(String title) {
        title = lowerCaseTitle(title);
        title = removeApostrophes(title);
        title = removeApostrophes(title);
        title = removePunctuationChars(title);
        title = removeSpaces(title);
        title = removeNoiseWords(title);
        title = trimTitle(title);
        return title;
    }

    private String lowerCaseTitle(String title) {
        return title.toLowerCase();
    }

    private String removeApostrophes(String title) {
        return title.replaceAll("'", "");
    }

    private String removePunctuationChars(String title) {
        return title.replaceAll("\\p{Punct}", " ");
    }

    private String removeSpaces(String title) {
        return title.replaceAll("\\s+", " ");
    }

    private String removeNoiseWords(String title) {
        for (String stopWord : STOP_WORDS) {
            title = title.replaceAll(String.format(" %s ", stopWord), " ");
        }
        return title;
    }

    private String trimTitle(String title) {
        return title.trim();
    }

}