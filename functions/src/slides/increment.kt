val increment: (Int) -> Int = { it + 1 }

val two = increment(1)

val alsoTwo = increment.invoke(1)



