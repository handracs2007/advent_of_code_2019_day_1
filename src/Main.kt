import java.io.File

fun calculateFuel(mass: Int): Int = mass / 3 - 2

fun main() {
    val sum = File("input.txt").readLines().map { calculateFuel(it.toInt()) }.reduce { acc, i -> acc + i }
    println(sum)
}