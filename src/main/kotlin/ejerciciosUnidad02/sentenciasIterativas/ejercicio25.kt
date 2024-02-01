package ejerciciosUnidad02.sentenciasIterativas

import kotlin.math.max

/*Solicitar al usuario que ingrese una frase y luego informar cuál fue la palabra más larga (en caso de haber más de
una, mostrar la primera) y cuántas palabras había.
Precondición: se tomará como separador de palabras al carácter “ “ (espacio), ya sea uno o más.
*/
fun main () {
    try {
        println("Introduce una frase y verás cúal fue la palabra más larga y cúantas palabras hay en la frase")
        val frase = readln().split(" ")
        var palabraLarga = ""
        var numPalabras = 0

        for (palabra in frase){
            numPalabras += 1
        }

        for (palabra in frase) {
            if (palabra.length > palabraLarga.length) {
                palabraLarga = palabra
            }
        }

        println("Número de palabras: $numPalabras")
        println("Palabra más larga: $palabraLarga")
    }catch (e: IllegalArgumentException){
        println("Datos introducidos erróneos.")
    }
}