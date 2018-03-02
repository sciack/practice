fun floating(i: Int): Int = i * 2

class DoubleMaths {
    fun double(input: Int): Int {
        fun local(i: Int): Int = i * 2

        val anonymous = fun(i: Int): Int = i * 2

        val lambda: (Int) -> Int = { i: Int -> i * 2 }

        val itLambda: (Int) -> Int = { it * 2 }

        return input * 2
    }
    val itLambda: (Int) -> Int = { it * 2 }
}
