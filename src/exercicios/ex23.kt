package exercicios

fun main(){
    println("Digite seu ano de nascimento: ")
    val anoNasc = readLine()!!.toInt()

    val Anos = 2025 - anoNasc

    if (Anos < 18){
        val qtdAnosFaltam = 18 - Anos
        println("Faltam $qtdAnosFaltam anos ")
    }

    if (Anos >=18){
        val qtdAnosPassados = Anos - 18
        println("Foi Passado $qtdAnosPassados anos ")
    }
}