package exercicios

fun main() {
    val fibonacci = IntArray(10)
    fibonacci[0] = 1
    fibonacci[1] = 1

    for (i in 2 until 10) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
    }

    println("Os 10 primeiros termos da sequência de Fibonacci são:")
    println(fibonacci.joinToString(" "))
}
