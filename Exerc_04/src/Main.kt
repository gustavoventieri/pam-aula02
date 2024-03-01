//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
inline fun transacao(funcao: () -> Unit){
    println("abrindo transação...")
    try {
        funcao()
    } finally {
        println("Fechando transação")
    }
}
fun main(){
    transacao {
        println("Executando 1 SQL ...")
        println("Executando 2 SQL...")
        println("Executando 3 SQL...")
        println("Executando 4 SQL...")

    }
}