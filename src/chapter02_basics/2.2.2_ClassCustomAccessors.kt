package chapter02_basics

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun main() {
    val rectangle = Rectangle(20, 20)
    println(rectangle.isSquare)
}