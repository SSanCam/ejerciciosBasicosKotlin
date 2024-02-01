package ejerciciosUnidad02.sentenciasIterativas

/*
Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido
(desde 1 hasta su edad).
*/
/**
 * Devuelve la cantidad de años introducido por el ususario.
 */
fun pedirAnios(): Int {
    try {
        //PEDIMOS AL USUARIO QUE INGRESE UNA EDAD.
        println("Introduce los años que tienes: ")
        var anios = readln()
        //COMPROBAMOS QUE EL DATO anios SEA UN DATO NUMÉRICO.
        while (anios.toIntOrNull() == null) {
            println("Debes introducir un número positivo entero")
            anios = readln()
        }
        //SEGUIMOS PIDIENDO EL DATO anios SI EL NÚMERO ES IGUAL O MENOR QUE 0
        while (anios.toInt() <= 0) {
            println("El número debe ser mayor de 0: ")
            anios = readln()
        }
        //DEVOLVEMOS LA CANTIDAD DE AÑOS QUE VAMOS A MOSTRAR.
        return anios.toInt()

    } catch (e: NumberFormatException) {
        println("ERROR - 404")
        return 0
    }
}

/**
 * Nos devolverá los números seguido desde 1 hasta el número de edad ingresado por el usuario.
 */

fun contarAnios(anios: Int) {

    for (anio in 1..anios + 1) {
        println(anio)
    }
}

/**
 * Devuleve la serie de números haciendo una llamada a la función contarAnios(), que devuelve la serie,
 * pasándole por parámetros la función pedirAnios(), que pide la edad al usuario.
 */
fun main() {
    println(contarAnios(pedirAnios()))
}