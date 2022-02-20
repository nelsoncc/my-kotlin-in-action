package chapter02_basics

// 2.25 Checking range membership using in
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

// 2.26 Using in checks as when branches
fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know..."
}

fun main() {
    println("is letter: 'R' -> ${isLetter('R')}")
    println("is not digit: 'z' -> ${isNotDigit('z')}")
    println(recognize('8'))
    println(recognize('B'))
    println("Kotlin" in "Java".."Scala") // The same as “Java” <= “Kotlin” && “Kotlin” <= “Scala”
    println("Kotlin" in setOf("Java", "Scala")) // This set does not contain the string “Kotlin”
}