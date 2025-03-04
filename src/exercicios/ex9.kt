package exercicios

fun main() {
    println("Digite uma distancia em metros: ")
    val distancia = readln().toFloat()

    val emKm =  distancia / 1000
    val emKmFormat = String.format("%.2f", emKm)
    println("A distancia $distancia metros em KM é : $emKmFormat")
}
