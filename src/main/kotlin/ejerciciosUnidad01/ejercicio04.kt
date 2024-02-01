package org.example.ejerciciosUnidad01

/*Escribe un programa que le pida al usuario una temperatura en grados Celsius, la convierta a grados Fahrenheit e
imprima por pantalla la temperatura convertida.*/

/**
 * pedirTemp
 *
 * @param temperatura son los grados Celsius que va a introducir el usuario
 * @return Devuelve la cantidad de grados que el usuario quiere convertir.
 */
fun pedirTemp() : Double {
    println("Introduce los grados Celsius que quieres convertir a Fahrenheit: ")
    var temperatura = readln().toDoubleOrNull()

    while (temperatura !is Double) {
        try {
            println("Introduce los grados Celsius que quieres convertir a Fahrenheit: ")
            temperatura = readln().toDoubleOrNull()

        } catch (e: NumberFormatException) {
            println("Error.\nDebes introducir un dato válido.\nInténtalo de nuevo.")
            return 0.0
        }
    }
    return temperatura
}


/**
 * conversorTemp
 *
 * @return devuelve la conversión de grados Celsius obtenidos en pedirTemp() a Fahrenheit
 *
 */
fun conversorTemp(grados: Double): Double{
    val conversion = (grados * 1.8) + 32
    return conversion
}

/**
 * Funcion principal, donde hacemos llamada a las dos funciones que usaremos
 * Imprime la conversión final a Fahrenheit de los datos proporcionados
 */
fun main() {
    val temp = pedirTemp()
    val conversion = conversorTemp(temp)

    println("$temp grados Celsius en Fahrenheit son: $conversion")
}