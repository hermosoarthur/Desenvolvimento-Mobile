package exercicios
// Jogo JOKENPO (Pedra-Papel-Tesoura)

import kotlin.random.Random

fun main() {
    val opcoes = listOf("Pedra", "Papel", "Tesoura")

    println("Escolha (Pedra, Papel ou Tesoura): ")
    val escolhaUsuario = readLine()?.capitalize()

    if (escolhaUsuario !in opcoes) {
        println("Escolha invalida! Tente novamente!")
    }
    val escolhaPC = opcoes[Random.nextInt(3)]

    println("Você escolheu: $escolhaUsuario")
    println("O PC escolheu: $escolhaPC")

        when {
            (escolhaUsuario == escolhaPC) -> println("Empate")
            (escolhaUsuario == "pedra" && escolhaPC == "tesoura") ||
                    (escolhaUsuario == "papel" && escolhaPC == "pedra") ||
                (escolhaUsuario == "tesoura" && escolhaPC == "papel")
        -> println("Você venceu!")

            else -> println("Você Perdeu!")
    }
}