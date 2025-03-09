package exercicios

fun main(){
    println("Digite a 1 nota : ")
    val n1 = readLine()!!.toFloat()
    println("Digite a 2 nota : ")
    val n2 = readLine()!!.toFloat()

    val media = (n1 + n2) / 2

    if (media >= 7){
        println("Aprovado, nota: $media")
    }
    if (media >= 5 && media <= 6.9){
        println("Recuperação, nota: $media")
    }
    if (media <= 4.9){
        println("Reprovado, nota: $media")
    }
}