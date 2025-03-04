package exercicios

fun main(){
    println("Digite a distancia que deseja percorrer em Km: ")
    val distancia = readln().toDouble()

    if (distancia > 200){
        val preco = distancia * 0.50
        println("Preco $preco")
    }

    else{
        val preco = distancia * 0.45
        println("Preco $preco")
    }
}