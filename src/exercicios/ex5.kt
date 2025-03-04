package exercicios

fun main():Unit {
    println("Digite a primeira nota: ")
    val n1 = readln().toDouble()
    println("Digite a segunda nota: ")
    val n2 = readln().toDouble()

    val media = (n1+n2)/2

    println("A media das notas é : $media")

}