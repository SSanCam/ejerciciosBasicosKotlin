package org.example.ejerciciosUnidad01

/*Escribir un programa que pregunte el nombre completo del usuario en la consola y después muestre por pantalla el
nombre completo del usuario tres veces, una con todas las letras minúsculas, otra con todas las letras mayúsculas y
otra solo con la primera letra del nombre y de los apellidos en mayúscula. El usuario puede introducir su nombre
combinando mayúsculas y minúsculas como quiera.*/

fun pedirNom(): String{
    try{
        println("Introduce tu nombre nombre completo: ")
        var nombre = readln().toString()
        return nombre

    }catch (e: IllegalArgumentException){
        println("Error\nInténtalo de nuevo: ")
        return ""
    }
}

fun repetirNom(nombre: String): Unit{
    val minus = nombre.lowercase()
    val mayus = nombre.uppercase()
    val title = nombre.capitalize()

    println("$nombre")
    println("$minus")
    println("$mayus")
    println("$title")
}

fun main(){
    repetirNom(pedirNom())
}