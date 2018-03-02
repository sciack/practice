fun sayHello(name: String, addExclamation: Boolean, addQuestionMark: Boolean, capitalise: Boolean) {
    val toPrint = name
        .let { if (addExclamation) it + "!" else it }
        .let { if (addQuestionMark) it + "?" else it }
        .let { if (capitalise) it.capitalize() else it }

    println("Hello, $toPrint")
}

fun main(args: Array<String>) {
    sayHello(
        "World",
        true,
        false,
        true
    )
}
