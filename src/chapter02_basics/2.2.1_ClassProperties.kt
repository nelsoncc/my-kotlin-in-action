package chapter02_basics

class Person(val name: String, var isMarried: Boolean) {
    override fun toString(): String = "My name is $name and I'm ${if (isMarried) "married" else "single"}"
}

fun main(args: Array<String>) {
    val personBob = Person("Bob", false)
    println(personBob)
    val personAlice = Person("Alice", true)
    println(personAlice)
    personAlice.isMarried = false
    println(personAlice)
}