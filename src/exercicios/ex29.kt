package exercicios

fun main(){
    println("Digite a largura :")
    val largura = readln()!!.toDouble()
    println("Digite o comprimento :")
    val comprimento = readln()!!.toFloat()

    val area = largura * comprimento

    if (area < 100){
        println("A area de $area m² se classifica por TERRENO POPULAR")
    }
    if (area >= 100 && area <= 500){
        println("A area de $area m² se classifica por TERRENO MASTER")
    }
    if (area > 500){
        println("A area de $area m² se classifica por TERRENO VIP")
    }
}