package org.example.ejerciciosUnidad02.sentenciasCondicionales

/*Escribir un programa que pida al usuario dos números y muestre por pantalla su división. Si el divisor es cero el
programa debe mostrar un error.*/

fun ejCond03(): Double {
    try {
        println("Introduce dos números para realizar su división.")
        println("Introduce un dividendo: ")
        val divid = readln().toInt()
        println("Introduce un divisor: ")
        val divis = readln().toInt()

        if (divis == 0){
            throw ArithmeticException("No puede dividirse entre 0.")
        }else{
            val division = (divid / divis).toDouble()
            return division
        }
    }catch (e: ArithmeticException){
        println("Error aritmético: ${e.message}")
        throw e
    }
}

fun main(){
    ejCond03()
}