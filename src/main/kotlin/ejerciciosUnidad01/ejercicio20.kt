package org.example.ejerciciosUnidad01

/*Los teléfonos de una empresa tienen el siguiente formato prefijo-número-extension donde el prefijo es el código del
país +34, y la extensión tiene dos dígitos (por ejemplo +34-913724710-56). Escribir un programa que pregunte por un
número de teléfono con este formato y muestre por pantalla el número de teléfono sin el prefijo y la extensión.*/

fun pedirTelf(): Unit{

    try {
        println("Introduce tu número completo, con prefijo y extensión, ej: +34-000000000-00")
        val numCompleto = readln().toString()

        val numSinPref = println("${numCompleto.substringAfter("-").substringBefore("-")}")
        return numSinPref

    }catch(e: IllegalArgumentException){
        println("ERROR - 404")
    }
}

fun main(){
    pedirTelf()
}