fun repeat(value: String, times: Int = 1, transformation: (String) -> String = { it }) {
    println(transformation(value).repeat(times))
}

fun main(args: Array<String>) {
    repeat("Hey", 2, { it.reversed() })
    repeat("Hey") { it.toUpperCase() }
}