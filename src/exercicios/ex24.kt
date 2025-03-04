package exercicios

fun main(){
    println("Digite seu nome:")
    val nome = readLine()!!.toString()
    print("Digite seu sexo(Homem ou Mulher): ")
    val sexo = readLine()!!.toString()
    print("Digite o total das compras: ")
    val compras = readLine()!!.toDouble()


    if (sexo == "Mulher"){
        val desconto = 0.13
        val totalComDesconto = compras - (compras * desconto)

        println("Com o desconto fica : R$$totalComDesconto")
    }
    if (sexo == "Homem"){
        val desconto = 0.05
        val totalComDesconto = compras - (compras * desconto)

        println("Com o desconto fica : R$$totalComDesconto")
    }

}