import rwk.format

fun main(args: Array<String>) {
    fun sum(vararg numbers: Int): Int { return numbers.sum() }

    println(format(result = sum(1, 2, 3, 4), suffix = "is the sum of the numbers"))
}