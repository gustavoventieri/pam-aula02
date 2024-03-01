inline fun <T> executarComLog(nomeFuncao: String, funcao: ()-> T): T{
    println("Entrando no Método $nomeFuncao...")
    try {
        return funcao()
    }
    finally {
        println("Metodo $nomeFuncao inicializado...")
    }
}
fun Somar(a:Int, b:Int):Int{
    return a + b
}
fun main(){
    val resultado = executarComLog("Somar"){
        Somar(7 , 5)
    }
    println(resultado)
}