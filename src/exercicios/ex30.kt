package exercicios

fun main(){
    println("Digite o nome do funcionario: ")
    val funcionario = readln()!!.toString()
    println("Digite o salario do funcionario: ")
    val salario = readln().toFloat()
    println("Digite quantos anos de trabalho: ")
    val anosTrabalhados = readln().toInt()

    if (anosTrabalhados <= 3){
        val novoSalario = (salario * 0.03) + salario
        println("O funcionario $funcionario com o salario reajustado fica $novoSalario")
    }
    if (anosTrabalhados > 3 && anosTrabalhados < 10){
        val novoSalario = (salario * 0.125) + salario
        println("O funcionario $funcionario com o salario reajustado fica $novoSalario")
    }
    if (anosTrabalhados >= 10){
        val novoSalario = (salario * 0.20) + salario
        println("O funcionario $funcionario com o salario reajustado fica $novoSalario")
    }
}