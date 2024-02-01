package org.example.ejerciciosUnidad02.capturaExcepciones

/*Ejercicio 2.3.3¶
Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese
número hasta cero separados por comas. Deberá solicitar el número hasta introducir uno correcto.
*/
fun main() {
    val serieInversa = mutableListOf<Int>()

    try {
        println("Introduce un número entero positivo: ")
        var numPosIntro = readln()
        while (numPosIntro.toIntOrNull() == null || numPosIntro.toInt() <= 0){
            println("Debes introducir un número entero positivo.\nInténtalo de nuevo: ")
            numPosIntro = readln()
        }

        for (num in numPosIntro.toInt() downTo 0){
            serieInversa.add(num)
        }

        println(serieInversa)

    }catch (e: NumberFormatException){
        println("Error en los datos introducidos.")
    }
}