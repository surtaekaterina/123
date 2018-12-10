package by.htp.library.entity;

public class Book {

	private int id;
	private String title;

	public Book() {
	}

	public Book(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + "]";
	}

}
