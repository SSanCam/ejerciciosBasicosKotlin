package org.example.ejerciciosUnidad02.sentenciaIterativas

import ejerciciosUnidad02.sentenciasIterativas.pedirNum

/*Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10.*/

fun multiplicar(num: Int): String {
    val tabla = mutableListOf<String>()

    for (multiplicador in 1..10) {
        val cuenta = num * multiplicador
        tabla.add("$multiplicador * $num = $cuenta")
    }

    return tabla.joinToString("\n")
}
fun main(){
    println("Introduce un numero para hacer su tabla de multiplicar")
    val num = pedirNum()
    println("Tabla del $num:")
    println (multiplicar(num))
}