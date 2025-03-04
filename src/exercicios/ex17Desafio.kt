package exercicios

fun main() {
    println("Quantos cigarros vc costuma fumar por dia: ")
    val qtdPorDia = readln().toDouble()

    println("Digite a quantidade de anos que vc fuma: ")

    val anos = readln().toDouble()

    val total = qtdPorDia * (anos * 365)
    val minutos = total * 10
    val diasPerdidos = minutos / (24 * 60)

    val diasPerdidosFormat = String.format("%.0f", diasPerdidos)

    println("Devido ao tabagismo vc perdeu =~ $diasPerdidosFormat dias ")
}