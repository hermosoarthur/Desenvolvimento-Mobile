package exercicios

fun main(){
    println("Digite a primeira nota: ")
    val n1 = readln().toDouble()

    println("Digite a segunda nota: ")
    val n2 = readln().toDouble()

    val media = (n1 + n2) / 2

    if (media >= 7){
        print("Aprovado, nota : $media")
    }
    else {
        print("Reprovado, nota : $media")
    }
}
