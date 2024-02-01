package org.example.ejerciciosUnidad02.capturaExcepciones

/*Ejercicio 2.3.4¶
Escribir un programa que pida al usuario un número entero, si la entrada no es correcta, mostrará el mensaje
"La entrada no es correcta" y lanzará la excepción capturada.
*/

fun main() {
    try {
        println("Introduce un número entero.")
        val numIntro = readln().toInt()
        println("Tu número ha sido $numIntro")
    }catch (e: NumberFormatException){
        println("La entrada no es correcta")
    }
}