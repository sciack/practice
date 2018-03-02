fun sayHello() {
    sayHello("World")
}

fun sayHello(name: String) {
    println("Hello $name!")
}

fun sayHelloTwice(first: String) {
    sayHelloTwice(first, first.toUpperCase())
}

fun sayHelloTwice(first: String, second: String) {
    println("Hello $first! $second?!")
}

fun main(args: Array<String>) {
    sayHello()          // Hello World!
    sayHello("John")    // Hello John!

    sayHelloTwice("Mary")  // Hello Mary! MARY?!
    sayHelloTwice("Carl", "CA-CARL")  // Hello Carl! CA-CARL?!
}
