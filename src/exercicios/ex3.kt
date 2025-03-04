package exercicios

fun main() {
    val nome = readln()
    val salario = readln()
    val salFormat = String.format("%.2f", salario)
    println("Nome do funcionario: $nome")
    println("Salario: $salario")
    println("O funcionário/a $nome tem um salário de R$ $salFormat em junho.")
}