class Book {
	String title;
	String author;
	int publicationYear;

	public Book() {
		this.title = "Unknown!";
		this.author = "Anon!";
		this.publicationYear = 1337;
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.publicationYear = 7331;
	}

	public Book(String title, String author, int publicationYear) {
		this(title, author);
		this.publicationYear = publicationYear;
	}
}

public static void main(String[] args) {
	final Book weirdState = new Book();
	final Book almostThere = new Book("Miss Dalloway", "Virginia Woolf");
	final Book weGood = new Book("The Highwayman", "Alfred Noyes", 1904);
}