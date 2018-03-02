package rwk

import java.time.LocalTime

fun Int.increment(i: Int) = i + 1

fun <T> T.log(): Unit = println("${LocalTime.now()} ${this}")