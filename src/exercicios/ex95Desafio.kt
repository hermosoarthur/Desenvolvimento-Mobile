package exercicios

fun fibonacci(quantidade: Int) {
    if (quantidade <= 0) {
        println("Por favor, insira um número maior que zero.")
        return
    }

    val sequencia = IntArray(quantidade)

    if (quantidade >= 1) sequencia[0] = 1
    if (quantidade >= 2) sequencia[1] = 1

    for (i in 2 until quantidade) {
        sequencia[i] = sequencia[i - 1] + sequencia[i - 2]
    }

    println(sequencia.joinToString(" >> ") + " >> FIM")
}

fun main() {
    print("Digite a quantidade de termos da sequência de Fibonacci: ")
    val n = readLine()?.toIntOrNull() ?: 0

    fibonacci(n)
}
