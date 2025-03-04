package exercicios

fun main(){
    println("Digite o ano : ")
    val ano = readLine()!!.toInt()

    if (ano % 4 == 0){
        println("O ano : $ano é bissexto")
    }
    else {
        println("O ano : $ano NÃO é bissexto")
    }
}