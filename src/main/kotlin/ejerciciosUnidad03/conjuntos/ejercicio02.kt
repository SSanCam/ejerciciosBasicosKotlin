package ejerciciosUnidad03.conjuntos
/*
Solicitar al usuario que introduzca los nombres de pila de los alumnos de primaria de una escuela, finalizando cuando
se introduzca “x”. A continuación, solicitar que introduzca los nombres de los alumnos de secundaria, finalizando al introducir “x”.

Mostrar los nombres de todos los alumnos de primaria y los de secundaria, sin repeticiones.
Mostrar qué nombres se repiten entre los alumnos de primaria y secundaria.
Mostrar qué nombres de primaria no se repiten en los de nivel secundaria.
Mostrar si todos los nombres de primaria están incluidos en secundaria.
*/

fun alumPrimaria(): MutableSet<String>{

    val nomPrimaria = mutableSetOf<String>()
    var seguir = true
    while (seguir){
        println("Introduce un nombre de alumno de primaria o 'x' para finalizar: ")
        val nombre = readln().trim()
        if (nombre.lowercase() == "x"){
            seguir = false
        }else{
            nomPrimaria.add(nombre)
        }
    }
    return nomPrimaria
}

fun alumSecundaria(): MutableSet<String> {

    val nomSecundaria = mutableSetOf<String>()
    var seguir = true
    while (seguir){
        println("Introduce un nombre de alumno de secundaria o 'x' para finalizar: ")
        val nombre = readln().trim()
        if (nombre.lowercase() == "x"){
            seguir = false
        }else{
            nomSecundaria.add(nombre)
        }
    }
    return nomSecundaria
}

fun main() {

    val nombresPrimaria = alumPrimaria()
    val nombresSecundaria = alumSecundaria()

    println("Los distintos nombres que encontramos en primaria son: ")
    for (nombre in nombresPrimaria){
        println(nombre)
    }
    println("Los distintos nombres que encontramos en secundaria son: ")
    for (nombre in nombresSecundaria){
        println(nombre)
    }
}