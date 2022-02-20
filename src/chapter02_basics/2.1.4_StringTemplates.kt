package chapter02_basics

fun main( args: Array<String> ) {
    // example of string template 1
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println( "Hello, $name!" )
    // example of string template 2
    if (args.isNotEmpty()) {
        println("Hello, ${args[0]}!")
    }
    // example of string template 3
    println("Hello, ${if (args.isNotEmpty()) args[0] else "someone"}!")
}