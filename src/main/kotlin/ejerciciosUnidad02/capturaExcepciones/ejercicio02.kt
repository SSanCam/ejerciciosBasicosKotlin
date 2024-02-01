package org.example.ejerciciosUnidad02.capturaExcepciones

/*Ejercicio 2.3.2¶
Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares
desde 1 hasta ese número separados por comas.
*/
fun main() {
    try {
        println("Introduce un número entero positivo para mostar la lista de impares: ")
        val numIntro = readln().toInt()
        var posicion = 1
        val serie = mutableListOf<Int>()
        for (num in 1..numIntro){
            serie.add(num)
            posicion += 2
        }
        println(serie)
    }catch (e: NumberFormatException){
        println("Entrada incorrecta.")
    }
}