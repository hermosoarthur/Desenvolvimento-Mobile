package exercicios

fun main() {
    println("Digite o valor do seu salário: ")
    val salario = readln().toDouble()

    val aumento =  (salario * 0.15) + salario

    println("O seu salario com o aumento de 15% fica : R$ ${aumento}")

}