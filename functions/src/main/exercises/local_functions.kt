fun countEach(words: List<String>) = words.map { it to it.length }

fun printOnePerLine(wordLengths: List<Pair<String, Int>>) = wordLengths.forEach { println("${it.first} (${it.second})") }

fun printWordLengths(value: String) {
    val words = value.split(" ")
    val wordLengths = countEach(words)
    printOnePerLine(wordLengths)
}

fun main(args: Array<String>) {
    printWordLengths("The quick brown fox jumps over a lazy dog")
}
