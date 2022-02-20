package chapter02_basics

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

// 2.3.5 - Smart Casts
fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

// 2.3.6 - Refactoring: replacing “if” with “when”
// 2.3.6.1 - Using if-expressions that return values
fun evalIf(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        evalIf(e.right) + evalIf(e.left)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

// 2.3.6.2 - Using when instead of if-cascade
fun evalWhen(e: Expr): Int =
    when (e) {
        is Num ->
            e.value
        is Sum ->
            evalWhen(e.right) + evalWhen(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalIf(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalWhen(Sum(Sum(Num(1), Num(2)), Num(4))))
}
