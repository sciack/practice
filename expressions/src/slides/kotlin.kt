
import whenAsAnExpression.UkCountry.England
import whenAsAnExpression.UkCountry.Scotland
import whenAsAnExpression.UkCountry.Wales
import java.io.Closeable
import java.io.File
import java.lang.Integer.parseInt

object blocks {
    fun countLetters(sentence: String): Int {
        var count = 0
        for (c in sentence) {
            if (c.isLetter()) count++
        }
        return count
    }

    fun allTheLetters() {
        println(countLetters("the big brown fox jumps over the lazy dog."))
        println(countLetters("strong and stable. weak and wobbly."))
    }
}

object expressions {
    fun countLetters(sentence: String): Int = sentence.filter { it.isLetter() }.count()

    fun allTheLetters() {
        println(countLetters("the big brown fox jumps over the lazy dog."))
        println(countLetters("strong and stable. weak and wobbly."))
    }
}

object blocksInlined {

//    fun allTheLetters() {
//        var count = 0
//        for (c in "the big brown fox jumps over the lazy dog.") {
//            if (c.isLetter()) count++
//        }
//        println(count)
//        var count = 0
//        for (c in "strong and stable. weak and wobbly.") {
//            if (c.isLetter()) count++
//        }
//        println(count)
//    }
}

object expressionsInlined {

    fun allTheLetters() {
        println("the big brown fox jumps over the lazy dog.".filter { it.isLetter() }.count())
        println("strong and stable. weak and wobbly.".filter { it.isLetter() }.count())
    }
}

object tryKt {
    fun theAnswer(input: String): Int {
        return try {
            Integer.parseInt(input)
        } catch (e: NumberFormatException) {
            42
        }
    }
}

object ifKt {
    fun describeYear(year: Int): String {
        val description: String = if (year > 1957) {
            "Space"
        } else if (year > 1970) {
            "Information"
        } else if (year > 1987) {
            "Multimedia"
        } else if (year > 2001) {
            "Big Data"
        } else "Prehistoric"

        return "The $description Age"
    }
}

object whenAsAnExpression {
    enum class UkCountry {
        England, NorthernIreland, Scotland, Wales
    }

    fun localAbuse(country: UkCountry): String =
        when (country) {
            England -> "Good day, sir! I said good day!"
            Scotland -> "Awa' an bile yer heid."
            Wales -> "Cer i grafu."
            else -> "Tear your hole off the Haggart."
        }
}

fun whenOptions() {
    val x = 99
    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        in 1..10 -> print("x is in the range 1-10")
        in listOf(1, 2, 3) -> print("x is 1, 2 or 3")
        !in 10..20 -> print("x is outside the range 10-20")
        parseInt(x.toString()) -> print("is `9` converted to an int")
        is Int -> print("is an int")
    }
}

object whenSmartCast {
    interface PersonalDetail {
        val description: String
    }

    class Name(val fullName: String) : PersonalDetail {
        override val description = "Full name of the person"
    }

    class Age(val years: Int) : PersonalDetail {
        override val description = "Age of the person in years"
    }

    fun describe(pd: PersonalDetail) {
        when (pd) {
            is Name -> println(pd.description + ". My name is ${pd.fullName}")
            is Age -> println(pd.description + ". My age is ${pd.years}")
        }
    }

    init {
        describe(Name("Madame Guillotine"))
    }
}

object Before {
    fun ensureFile(name: String): String {
        val file = File(name)
        file.parentFile.mkdirs()
        return file.absolutePath
    }
}

object afterKt {
    fun ensureFile(name: String) = File("name.txt").let { f ->
        f.mkdirs()
        f.absolutePath
    }
}

object let {
    fun ensureFile(name: String): String = File("name.txt").let { f ->
        f.mkdirs()
        f.absolutePath
    }
}

object run {
    fun ensureFile(name: String): String = File("name.txt").run {
        this.mkdirs()
        this.absolutePath
    }
}

object with {
    fun ensureFile(name: String): String = with(File("name.txt")) {
        this.mkdirs()
        this.absolutePath
    }
}

object apply {
    fun ensureFile(name: String): File = File("name.txt").apply {
        this.mkdirs()
        this.absolutePath
    }
}

object also {
    fun ensureFile(name: String): File = File("name.txt")
        .apply { mkdirs() }
        .also { println("using " + it.absolutePath) }
}

object use {
    interface CsvFileReader : Closeable {
        fun readAllLines(): List<String>
    }

    fun noLinesIfEmpty(csvReader: CsvFileReader): List<String> {
        val linesFromCsv: List<String> = csvReader.use {
            val content = it.readAllLines()
            when {
                content.size == 1 -> emptyList()
                else -> content
            }
        }
        return linesFromCsv
    }
}