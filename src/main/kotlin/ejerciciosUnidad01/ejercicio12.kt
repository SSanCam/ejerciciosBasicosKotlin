package org.example.ejerciciosUnidad01

/*Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros), calcule el índice de masa corporal
y lo almacene en una variable, y muestre por pantalla la frase Tu índice de masa corporal es donde es el índice de masa
corporal calculado redondeado con dos decimales.*/

/**
 * pedirPeso
 * @param peso Es el dato numérico pedido al usuario
 * @return Devuelve el dato del peso pedido al usuario.
 */
fun pedirPeso(): Double{
    try {
        println("Ingresa tu peso en Kg: ")
        var  peso = readln().toDoubleOrNull()

        while (peso !is Double){
            println("Dato erróneo.\nIngresa de nuevo tu peso en Kg: ")
            peso = readln().toDoubleOrNull()
        }
        return peso
    }catch (e: NumberFormatException){
        println("Error - 404")
        return 0.0
    }
}

/**
 * pedirAltura
 * @param altura Es la medida en metros dada por el usuario.
 * @return La altura del usuario.
 */

fun pedirAltura(): Double{
    try {
        println("Ingresa tu altura en metros: ")
        var altura = readln().toDoubleOrNull()

        while (altura !is Double){
            println("Introduce un dato válido: ")
            altura = readln().toDoubleOrNull()
        }
        return altura
    }catch (e: NumberFormatException){
        println("ERROR - 404")
        return 0.0
    }
}

/**
 * @return Esta función recibe tanto el peso como la altura y devuelve el IMC correspondiente.
 */
fun indiceMasCorp(peso: Double, altura: Double) : Double{

    val imc = peso / (altura * altura)
    return imc
}

fun main(): Unit {

    val peso = pedirPeso()
    val altura = pedirAltura()
    val resultado = indiceMasCorp(pedirPeso(), pedirAltura())
    val resultadoFormateado = String.format("%.2f",resultado)

    val mensaje = println("Para tu altura de $altura y tu peso de $peso, tu IMC total es de: $resultadoFormateado")

    return mensaje

}