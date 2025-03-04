package exercicios

fun main(){
    println("Digite a  velociade em km: ")
    val velocidade = readln().toDouble()

    if (velocidade > 80) {
        println("Você foi multado")
        val acima_velocidade = velocidade - 80

        val multa = acima_velocidade * 5

        println("A multa é de $multa")

    }
}