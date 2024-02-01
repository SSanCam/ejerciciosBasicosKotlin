package ejerciciosUnidad03.listasTuplas

/*Escribir un programa que pida al usuario una palabra y muestre por pantalla si es un palíndromo.*/

fun main(){
    try {
        println("Introduce una palabra para ver si es palíndromo: ")
        val palabra = readln()

        if (palabra == palabra.reversed()){
            println("La palabra \'$palabra\' es un palíndromo.")
        }else{
            println("La palabra \'$palabra\' no es un palíndromo.")
        }
    }catch (e: IllegalArgumentException){
        println("Cual es tu problema??")
    }

}