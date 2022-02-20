package chapter02_basics

fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
}

fun maxSimplified(a: Int, b: Int) = if(a > b) a else b

fun main(){
    println(max(46, 2))
    println(maxSimplified(46, 2))
}