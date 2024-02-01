package org.example.ejerciciosUnidad01

/*Ejercicio 1.2.6¶
Escribe un programa que pida el importe final de un artículo y calcule e imprima por pantalla el IVA que se ha pagado
y el importe sin IVA (suponiendo que se ha aplicado un tipo de IVA del 10%).*/

/**
 * importeFinal
 * Pide el importe de un artículo.
 * @return El precio final del artículo.
 */
fun importeFinal(): Double{
    println("¿Cuál es el precio del artículo?\n")
    var precioFinal = readln().toDoubleOrNull()

    while (precioFinal !is Double){

        try {
            println("ERROR\nIntroduce el precio del artículo: ")
            precioFinal = readln().toDoubleOrNull()
        }catch (e: NumberFormatException){
            println("ERROR")
            return 0.0
        }
    }
    return precioFinal
}

/**
 * @return Se devuelve el 10% del precio del artículo que se ha añadido.
 */
fun calIva(precio: Double): Double{
    val diferencia = precio * 0.1

    return diferencia
}

/**
 * @return Devolvemos el calculo del artículo, tanto con IVA como sin IVA
 */

fun main(): Unit{
    val articulo = importeFinal()
    val porcentaje = calIva(articulo)
    val articuloSinIva = articulo - porcentaje

    val resultado = println("Precio de articulo: $articuloSinIva€\n" +
            "Aplicandole el 10%\nEl precio final es de: $articulo€")

    return resultado
}