package match.client;

public enum BooksToMatch {
	BOOK_TITLE_1("Shoulder Arthroplasty"),
	BOOK_TITLE_2("Good Night Moon"),
	BOOK_TITLE_3("AIDS Therapy"),
	BOOK_TITLE_4("Andrews' Diseases of the Skin: Clinical Dermatology");

	private String title;

	private BooksToMatch(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}
