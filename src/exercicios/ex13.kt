package exercicios

fun main(){
    println("Digite o valor do produto: ")
    val valor = readln().toDouble()

    val desconto = valor * 0.05

    val preco_desconto = valor - desconto

    println("O preço promocional é de : R$ ${preco_desconto}")
}