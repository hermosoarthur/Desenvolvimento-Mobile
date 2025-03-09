package exercicios

import kotlin.random.Random

fun main() {
    val numeros = IntArray(20) { Random.nextInt(0, 100) }

    println("Números gerados:")
    println(numeros.joinToString(" "))

    numeros.sort()

    println("Números ordenados:")
    println(numeros.joinToString(" "))
}
