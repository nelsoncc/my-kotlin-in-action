package chapter02_basics.tryAsAnExpression

import java.io.BufferedReader
import java.io.StringReader

// Listing 2.28 Using try as an expression
fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
    println(number)
}

// Listing 2.29 Returning a value in catch
fun readNumberCatched(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}

fun main() {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber(reader)
    readNumberCatched(reader)
}
