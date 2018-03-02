package library;

public class Author {

    public final int id;
    public final String firstName;
    public final String lastName;
    public final int birthYear;

    public Author(int id, String firstName, String lastName, int birthYear) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
}
