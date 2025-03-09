package exercicios

import kotlin.random.Random


fun main(){
    println("Descubra qual é o numero sorteado de (1 a 5)")
    val nUsuario = readLine()?.toIntOrNull()
    val nSorteado = Random.nextInt(1, 6)



    if (nUsuario == null) {
        println("Por favor, insira um número válido.")
    }
    else if (nUsuario !in 1..5) {
            println("O número deve estar entre 1 e 5. Tente novamente.")
    }

     else {
        if (nUsuario == nSorteado) {
            println("Parabéns! Você acertou o número!")
        } else {
            println("Você errou. O número sorteado era $nSorteado.")
        }
    }
}


