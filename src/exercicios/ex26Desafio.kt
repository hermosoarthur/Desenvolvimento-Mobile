package exercicios

fun main(){
    println("Digite o comprimento do segmento 1 : ")
    val seg1 = readLine()!!.toFloat()

    println("Digite o comprimento do segmento 2 : ")
    val seg2 = readLine()!!.toFloat()

    println("Digite o comprimento do segmento 3 : ")
    val seg3 = readLine()!!.toFloat()


    if ((seg2 + seg3 > seg1) && (seg1 + seg3 > seg2) && (seg1 + seg2 > seg3)) {
        println("É possivel criar um triangulo")
        }

    else{
    println("Não é possivel criar o triangulo")}
}