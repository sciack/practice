fun externalPrintNumbers(numbers: List<Number>) = numbers.forEach(::println)

fun printNumbers(value: Number) {
    externalPrintNumbers(listOf(value))
}

fun printNumbers(firstValue: Number, secondValue: Number) {
    externalPrintNumbers(listOf(firstValue, secondValue))
}

fun printNumbers(firstValue: Number, secondValue: Number, thirdValue: Number) {
    externalPrintNumbers(listOf(firstValue, secondValue, thirdValue))
}

fun main(args: Array<String>) {
    println("printing with single argument:")
    printNumbers(1)

    println("printing with two arguments:")
    printNumbers(1, 2)

    println("printing with three arguments:")
    printNumbers(1, 2, 3)
}
