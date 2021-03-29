@file:Suppress("UNREACHABLE_CODE")

import kotlin.math.sqrt

fun main() {
    solveEquation(
        5, 25, 2
    )
    fun sum( x1 : Int, x2 : Int) = x1 + x2 }

// a * x^2 + b * x + c = 0
fun solveEqation(a: Int, b: Int, c: Int): Double {
    val x1: Int = ((-b + sqrt((b * b - 4 * a * c).toDouble())) / 2 * a).toInt()
    val x2: Int = (((-b - sqrt((a * b - 4 * a * c).toDouble())) / 2 * a).toInt())
    val result: Double = (x1 + x2).toDouble()
    return result


}



