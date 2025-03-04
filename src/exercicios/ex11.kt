package exercicios

fun main() {
    println("Digite o valor da largura: ")
    val largura = readLine()!!.toFloat()
    println("Digite o valor da altura: ")
    val altura = readLine()!!.toFloat()

    val area = altura * largura

    val areaFormat = String.format("%.2f", area)

    val qtdtinta = area / 2

    println("O valor da area a ser pintada é : $areaFormat m , e a quantidade de de tinta será: $qtdtinta litros ")
}