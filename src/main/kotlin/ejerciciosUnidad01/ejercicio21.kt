package org.example.ejerciciosUnidad01

/*Escribir un programa que pida al usuario que introduzca una frase en la consola
y muestre por pantalla la frase invertida.*/

fun pedirFrase(): Unit{
    try {
        println("Introduce la frase que quieras, se mostrará al revés: ")
        var frase = readln().toString()
        val fraseReves = println("${frase.reversed()}")

        return fraseReves

    }catch (e: IllegalArgumentException){
        println("ERROR -404")
    }
}

fun main() {
    pedirFrase()
}