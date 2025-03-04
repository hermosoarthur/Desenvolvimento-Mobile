package exercicios

fun main() {
    println("Digite um numero :")
    val n = readln().toInt()
    val antecessor = n - 1
    val sucessor = n - 2

    println("O numero $n é antecessor de $antecessor e sucessor de $sucessor")
}