package exercicios

fun main(){
    println("Digite seu ano de nascimento: ")
    val anoNasc = readLine()!!.toInt()

    val Anos = 2025 - anoNasc

    if (Anos >=18){
        println("Você pode votar!")
    }
    else {
        println("Você não pode votar")
    }

}