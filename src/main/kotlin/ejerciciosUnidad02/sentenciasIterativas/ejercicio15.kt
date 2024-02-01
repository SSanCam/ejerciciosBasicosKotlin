package ejerciciosUnidad02.sentenciasIterativas

/*Leer números enteros de teclado, hasta que el usuario ingrese el 0. Finalmente, mostrar la sumatoria de todos los
números positivos ingresados.
*/
fun main() {
    try {
        var sumatorio = 0.0
        println("Introduce tantos números como quieras sumas.\nIntroduce 0 para salir del programa.")
        println("Número>")
        var numSumar = readln().toDoubleOrNull()
        while (numSumar?.toInt() != 0 && numSumar != null){
            sumatorio += numSumar
            println("Número>")
            numSumar = readln().toDouble()
        }
        if (numSumar?.toInt() == 0){
            println("La suma total ha sido de: $sumatorio")
        }
    }catch (e: IllegalArgumentException){
        println("Error en los datos ingresados.")
    }
}