fun main() {
    for (n in ordenar(38, 3, 456, 8, 51, 1, 188, 73,10)) {
        println("$n")
    }
}
fun ordenar(vararg numeros:Int):IntArray{
    return numeros.sortedArray()
}
