import kotlin.math.sqrt
import kotlin.math.PI
import kotlin.math.pow
class Operacoes{
    fun TrianEsca(a: Float, b: Float, c: Float): Float {
        val s = (a + b + c) / 2
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }
    fun TrianIsos(a: Float, b: Float): Float {
        return (a*b)/2
    }
    fun TrianEquila(lado: Float): Float {
        return (sqrt(3.0) / 4.0 * lado * lado).toFloat()
    }
    fun ArReta(alt:Float, bas:Float):Float{
        return alt*bas
    }
    fun Arcirc(raio:Double):Double{
        return PI * raio.pow(2)
    }
    fun ArLosa(d1: Double, d2: Double): Double {
        return (d1 * d2) / 2
    }
    fun ArTrap(B: Double, b: Double, h: Double): Double {
        return ((B + b) * h) / 2
    }
}

fun main(){
    println("Digite o tipo de calculo")
    println("TES = Triangulo Escaleno")
    println("TI = Triangulo Isoceles")
    println("TE = Triangulo Equilatero ")
    println("AR =  Retângulo")
    println("AC =  Círculo")
    println("AL = Losangulo")
    println("AT = Trapézio")

    val Operador= readLine()
    val operadores = Operacoes()

    if(Operador == "TES" ){
        println("Digite o Valor do lado 1")
        val a = readLine()?.toFloatOrNull()
        println("Digite o Valor do lado 2")
        val b = readLine()?.toFloatOrNull()
        println("Digite o Valor do lado 3")
        val c = readLine()?.toFloatOrNull()

        if (a != null && b != null && c != null && a + b > c && a + c > b && b + c > a) {
            println("Resultado: ${operadores.TrianEsca(a, b, c)}")
        } else {
            println("digite os valores válidos")
        }
    }
    else if(Operador == "TI" ){
        println("Digite o Valor da Base")
        val a = readLine()?.toFloatOrNull()
        println("Digite o Valor para Altura")
        val b = readLine()?.toFloatOrNull()

        if (a != null && b != null ) {
            println("Resultado: ${operadores.TrianIsos(a, b)}")
        } else {
            println("digite os valores válidos")
        }
    }
    else if(Operador == "TE" ){
        println("Digite o Valor do Lado")
        val a = readLine()?.toFloatOrNull()

        if (a != null ) {
            println("Resultado: ${operadores.TrianEquila(a)}")
        } else {
            println("digite os valores válidos")
        }
    }
    else if(Operador == "AR" ){
        println("Digite o Valor da Base")
        val a = readLine()?.toFloatOrNull()
        println("Digite o Valor para Altura")
        val b = readLine()?.toFloatOrNull()
        if (a!= null && b != null) {
            if (a > b) {
                println("O valor para altura não pode ser maior que o valor da base. Por favor, digite valores válidos.")
            } else {
                println("Resultado: ${operadores.ArReta(a, b)}")
            }
        } else {
            println("digite os valores válidos")
        }
    }
    else if(Operador == "AC" ){
        println("Digite o Valor do Raio")
        val Raio = readLine()?.toDoubleOrNull()

        if (Raio != null  ) {
            println("Resultado: ${operadores.Arcirc(Raio)}")
        } else {
            println("digite os valores válidos")
        }
    }
    else if(Operador == "AL" ){
        println("Digite o Valor da Diagonal 1")
        val d1 = readLine()?.toDoubleOrNull()
        println("Digite o Valor da Diagonal 2")
        val d2 = readLine()?.toDoubleOrNull()

        if (d1 != null && d2 != null) {
            println("Resultado: ${operadores.ArLosa(d1,d2)}")
        } else {
            println("digite os valores válidos")
        }
    }
    else if(Operador == "AT" ){
        println("Digite o Valor da Base Maior")
        val B = readLine()?.toDoubleOrNull()
        println("Digite o Valor do Base Meno")
        val b = readLine()?.toDoubleOrNull()
        println("Digite o Valor da Altura")
        val h = readLine()?.toDoubleOrNull()

        if (B != null && b != null && h != null) {
            println("Resultado: ${operadores.ArTrap(B , b, h)}")
        } else {
            println("digite os valores válidos")
        }
    }
    else{
        println("Digite um tipo de calculo certo, repita o preoceso!")
    }
}