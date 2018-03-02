package library;

import java.util.List;

public class NullAuthors {

    private final List<Author> authors;

    public NullAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Author lookup(int id) {
        return authors.stream().filter(a -> a.id == id).findFirst().orElse(null);
    }
}
