package exercicios

fun main(){
    println("Digite o primeiro valor: ")
    val n1 = readln().toInt()
    println("Digite o segundo valor: ")
    val n2 = readln().toInt()

    if (n1 > n2){
        println("O primeiro valor é maior")
    }
    if (n1 < n2){
        println("O segundo valor é maior")
    }
    if(n1 == n2){
        println("Os dois valores são iguais")
    }
}