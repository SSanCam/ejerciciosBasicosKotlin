package org.example.ejerciciosUnidad02.sentenciasCondicionales

/*Escribir un programa que almacene la cadena de caracteres contraseña en una variable, pregunte al usuario por la
contraseña e imprima por pantalla si la contraseña introducida por el usuario coincide con la guardada en la variable
sin tener en cuenta mayúsculas y minúsculas.*/
fun ej02Cond(): Unit?{

    try {
        val password = "pestillo1234"
        println("Introduce tu contraseña: ")
        var passIntro = readln().toLowerCase()
        while (passIntro != password){
            println("La contraseña es incorrecta.\nInténtalo de nuevo: ")
            passIntro = readln().toLowerCase()
        }
        return println("Contraseña correcta!")
    }catch (e: Exception){
        println("ERROR - 404")
        return null
    }
}

fun main(){
    ej02Cond()
}