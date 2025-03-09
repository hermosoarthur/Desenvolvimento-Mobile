package exercicios

fun main() {

    print("Digite o primeiro termo da PA: ")
    val primeiroTermo = readLine()?.toIntOrNull() ?: 0

    print("Digite a razão da PA: ")
    val razao = readLine()?.toIntOrNull() ?: 0

    var soma = 0
    println("Os 10 primeiros termos da PA são:")

    for (i in 0 until 10) {
        val termo = primeiroTermo + i * razao
        print("$termo ")
        soma += termo
    }
    println("\nA soma dos 10 primeiros termos é: $soma")
}
