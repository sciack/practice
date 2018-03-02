package library;

public class Book {

    public final String isbn;
    public final String title;
    public final Author author;
    public final int year;

    public Book(String isbn, String title, Author author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
    }
}
