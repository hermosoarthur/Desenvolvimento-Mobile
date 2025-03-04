package exercicios

fun main(){
    println("Digite numero: ")
    val n = readLine()!!.toInt()

    if (n % 2 == 0){
        println("O numero $n é  par ")
    }

    else{
        println("O numero $n é impar")
    }
}