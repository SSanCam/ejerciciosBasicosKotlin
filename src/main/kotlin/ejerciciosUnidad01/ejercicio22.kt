package org.example.ejerciciosUnidad01

/*Escribir un programa que pida al usuario que introduzca una frase en la consola y una vocal, y después muestre
por pantalla la misma frase pero con la vocal introducida en mayúscula.*/
/**
 * @return Obtenemos la frase que hemos pedido al usuario:
 * @param frase
 */
fun pedirOracion(): String {
    try {
        println("Introduce una frase: ")
        val frase = readln().toString()
        return frase
    }catch (e: IllegalArgumentException) {
        println("ERROR - 404")
        return ""
    }
}

/**
 * @retrun Obtenemos la vocal pedida al usuario.
 * @param vocal
 */
fun pedirVocal(): Char {
    val vocales = "aeiou"
    try {
        println("Introduce la vocal que quieras contar: ")
        var vocal = readln().toString().first().lowercaseChar()

        while (vocal !in vocales.lowercase()){
            println("Debes introducir una vocal.\nInténtalo de nuevo: ")
            vocal = readln().toString().first().lowercaseChar()
        }
        return vocal
    }catch (e: IllegalArgumentException){
        println("Error de datos.")
        return '\u0000'
    }
}

/**
 * @return Tomando los valores de las anteriores funciones, obtenemos el número de vesces que se repite la vocal
 * introducida por el usuario.
 */
fun contarVocales(frase: String, vocal: Char): Unit{

    var contadorVocales = 0

    for (caracter in frase){
        if (caracter == vocal){
            contadorVocales ++
        }
    }

    var veces = ""

    if (contadorVocales == 1){
        veces = "vez."
    }else{
        veces = "veces."
    }

    val resultado = println("Se ha encontrado la vocal \'$vocal\' un total de $contadorVocales $veces")
    return resultado
}

/**
 * Funcion principal
 * @return Devuelve el texto generado en la función contarVocales(),
 *          que usa los datos de pedir la oraciíon y la vocal a buscar.
 */
fun main(){
    return contarVocales(pedirOracion(), pedirVocal())
}