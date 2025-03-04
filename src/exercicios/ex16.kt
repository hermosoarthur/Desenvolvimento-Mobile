package exercicios

fun main(){
    println("Digite a quantidade de dias trabalhados desse mês : ")
    val dias_trabalhados = readln().toDouble()

    val salario = dias_trabalhados * (8 * 25)

    println("O seu salário desse mes é : R$${salario}")


}