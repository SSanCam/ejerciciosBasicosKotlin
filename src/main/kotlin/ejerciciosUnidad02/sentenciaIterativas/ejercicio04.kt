package org.example.ejerciciosUnidad02.sentenciaIterativas

/*Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás
desde ese número hasta cero separados por comas.
*/

fun pedirNum(): Int{

    try {
        println("v")
        var num = readln()

        while (num.toIntOrNull() == null){
            println("Debes introducir un número entero.\nInténtalo de nuevo: ")
            num = readln()
        }
        while (num.toInt() <= 0){
            println("Introduce un número entero mayor que 0: ")
            num = readln()
        }
        return num.toInt()

    }catch (e: NumberFormatException){
        println("ERROR - 404")
        return 0
    }
}

fun countDown(numero: Int): MutableList<String> {
    var serieNum = mutableListOf<String>()

    for (num in numero downTo 0){
       serieNum.add(num.toString())
    }
    return serieNum
}



fun main(){
    println("Introduce un número entero positivo para realizar la cuenta atrás: ")
    val numero = pedirNum()
    val serie = countDown(numero)
    println("La cuenta atrás desde $numero: $serie")

}