package exercicios

fun main(){
    println("Digite a quantidade de Km percorrido: ")
    val km_percorrido = readln().toDouble()

    println("Digite quantos dias vc alugou: ")
    val dias = readln().toFloat()

    val total_a_pagar = (km_percorrido * 0.20) + (dias * 90)

    println("Total de pagar : R$${total_a_pagar}")
}