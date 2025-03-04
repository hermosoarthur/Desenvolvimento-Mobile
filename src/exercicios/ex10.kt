package exercicios

fun main() {
    println("Quanto de dinheiro vc tem na carteira :")
    val dinheiro = readln().toFloat()

    val dolarcotacao = 3.45

    val dolar = dinheiro / dolarcotacao

    val dolarFormat = String.format("%.2f", dolar)

    println("Com R$ $dinheiro da sua carteira , vc tem $dolarFormat dolares")


}