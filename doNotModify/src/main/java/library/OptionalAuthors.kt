package library

import java.util.Optional

class OptionalAuthors(private val authors: List<Author>) {

    fun lookup(id: Int): Optional<Author> {
        return authors.stream().filter { a -> a.id === id }.findFirst()
    }
}
