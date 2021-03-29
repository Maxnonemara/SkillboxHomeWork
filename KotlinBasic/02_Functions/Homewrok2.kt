import kotlin.math.sqrt

fun main() {solveEquation(3,14,5)

}

fun solveEquation(a: Int, b: Int, c: Int) : Double {
    val x1: Double
    val x2: Double
    val aD = a.toDouble()
    val bD = b.toDouble()
    val cD = c.toDouble()


    x1 = (-bD + sqrt(bD * bD - 4 * aD * cD)) / 2 * aD
    x2 = ((-bD - sqrt(aD * bD - 4 * aD * cD)) / 2 * aD)
    println("x1 = $x1 x2 =$x2")
    return x1 + x2
// привет как твое деоа 
}

