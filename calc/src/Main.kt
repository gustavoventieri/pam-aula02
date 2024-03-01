class Operadores{
    fun somar(a:Int,b:Int):Int{
        return a+b
    }
    fun sub(a:Int,b:Int):Int{
        return a-b
    }
    fun mult(a:Int,b:Int):Int{
        return a*b
    }
    fun divi(a:Int,b:Int):Int{
        return a/b
    }

}

fun main() {
    println("valor A")
    val a= readLine()?.toIntOrNull()
    println("valor B")
    val b= readLine()?.toIntOrNull()

    if (a != null && b != null) {
        println("Digite a operação desejada")
        println("+")
        println("-")
        println("*")
        println("/")
        val operacao = readLine()
        val operadores = Operadores()

        when (operacao) {
            "+" -> println("Resultado: ${operadores.somar(a, b)}")
            "-" -> println("Resultado: ${operadores.sub(a, b)}")
            "*" -> println("Resultado: ${operadores.mult(a, b)}")
            "/" -> if (b == 0) {
                println("Não é possivel divisão por 0")
            } else {
                println("Resultado: ${operadores.divi(a, b)}")
            }

            else -> println("Operação inválida!")
        }
    }
    else {
        println("valores passados invalidos!")
    }
}