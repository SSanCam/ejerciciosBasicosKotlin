package ejerciciosUnidad03.listasTuplas
/*Escribir un programa que pregunte por una muestra de números, separados por comas, los guarde en una lista y
muestre por pantalla su media y desviación típica.*/
import kotlin.math.pow
import kotlin.math.sqrt
fun main () {

    val listaNum = mutableListOf<Int>()
    println("Introduce 5 números enteros positivos: ")

    for (i in 1..5){
        println("num >")
        val num = readln().toInt()
        listaNum.add(num)
    }
    println(listaNum)
    //media de la lista
    val media = listaNum.average()
    println("La media de los números de la lista es de: $media")
    // Calcular la varianza
    val varianza = listaNum.map { (it - media).pow(2) }.average()
    // Calcular la desviación típica
    val desviacionTipica = sqrt(varianza)
    println("Desviación típica: ${String.format("%.2f",desviacionTipica)}")
}