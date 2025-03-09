package exercicios

import kotlin.random.Random

fun main() {
    val nSorteado = Random.nextInt(1, 11)
    println("Tente adivinhar o número sorteado entre 1 e 10. Você tem 4 tentativas!")
    var tentativas = 4
    var nUsuario: Int? = null

    while (tentativas > 0) {
        println("Você tem $tentativas tentativas restantes.")


        val nUsuario = readln().toIntOrNull()


        if (nUsuario == null) {
            println("Por favor, insira um número válido.")
        } else if (nUsuario !in 1..10) {
            println("O número deve estar entre 1 e 10. Tente novamente.")
        } else {

            if (nUsuario == nSorteado) {
                println("Parabéns! Você acertou o número!")
                break
            } else {
                tentativas--
                if (tentativas == 0) {
                    println("Você errou todas as tentativas. O número sorteado era $nSorteado.")
                } else {
                    println("Você errou! Tente novamente.")
                }
            }
        }
    }
}
