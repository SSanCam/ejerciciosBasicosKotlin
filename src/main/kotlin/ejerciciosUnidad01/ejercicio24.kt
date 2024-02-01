package org.example.ejerciciosUnidad01

/*Escribir un programa que pregunte por consola el precio de un producto en euros con dos decimales y muestre por
pantalla el número de euros y el número de céntimos del precio introducido.*/

/**
 * @param precio pedimos el precio del articulo.
 * @return Se devuelve el precio del articulo como Double.
 */
fun precioArt(): Double{
    try {
        println("Introduce el precio del articulo: ")
        var precio = readln().toDoubleOrNull()

        while (precio !is Double){
            println("Debes introducir un valor numérico: ")
            precio = readln().toDoubleOrNull()
        }
        return precio
    }catch (e: IllegalArgumentException){
        println("Error.")
        return 0.0
    }
}

/**
 * @return Devuelve los Euros separados de los céntimos.
 */

fun convMonedas(precio: Double): Unit{

    var euros = precio.toInt()
    var cents = ((precio - euros) * 100).toInt()
    val resultado = println("Precio final:\nEuros: $euros\nCéntimos: $cents")
    return resultado
}

/**
 * Llamamos a una funcion, pasandole como parámetro el return de la  otra función
 * @return Devuelve el bloque de texto teniendo en cuenta los resultados de ambas funciones.
 */
fun main () {
    convMonedas(precioArt())
}