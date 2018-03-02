fun toCamelCase(value: String) = value.split(" ").map { capitalizeFirst(it) }.joinToString("")

fun capitalizeFirst(value: String): String = value.take(1).capitalize() + value.drop(1).toLowerCase()

fun main(args: Array<String>) {
    val result = toCamelCase("my first extension")
    println("result = $result")
}
