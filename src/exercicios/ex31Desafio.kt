package exercicios

fun main() {
    println("Digite o comprimento do segmento 1 : ")
    val seg1 = readLine()!!.toFloat()

    println("Digite o comprimento do segmento 2 : ")
    val seg2 = readLine()!!.toFloat()

    println("Digite o comprimento do segmento 3 : ")
    val seg3 = readLine()!!.toFloat()

    if ((seg2 + seg3 > seg1) && (seg1 + seg3 > seg2) && (seg1 + seg2 > seg3)) {
        println("É possivel criar um triangulo")

        if (seg1 == seg2 && seg2 == seg3) {
            println("Será formado um tipo EQUILÁTERO")
        } else if (seg1 == seg2 || seg1 == seg3 || seg2 == seg3) {
            println("Será formado um tipo ISÓSCELES")
        } else {
            println("Será formado um tipo ESCALENO")
        }
    }

        else {
        println("Não é possivel criar o triangulo")
    }
}
