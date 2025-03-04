package exercicios

fun main(){
    println("Digite o valor de A:")
    val a = readln().toDouble()

    println("Digite o valor de B:")
    val b = readln().toDouble()

    println("Digite o valor de C:")
    val c = readln().toDouble()

    val delta = (b * b) - (4 * a * c)

    println("O valor de delta é : $delta")


}