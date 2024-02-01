package org.example.ejerciciosUnidad02.sentenciasCondicionales

/*En una determinada empresa, sus empleados son evaluados al final de cada año. Los puntos que pueden obtener en la
evaluación comienzan en 0.0 y pueden ir aumentando, traduciéndose en mejores beneficios. Los puntos que pueden conseguir
los empleados pueden ser 0.0, 0.4, 0.6 o más, pero no valores intermedios entre las cifras mencionadas.
A continuación se muestra una tabla con los niveles correspondientes a cada puntuación.
La cantidad de dinero conseguida en cada nivel es de 2.400€ multiplicada por la puntuación del nivel.

Nivel	Puntuación
Inaceptable	0.0
Aceptable	0.4
Meritorio	0.6 o más*/

/**
 * @return Devuelve la puntuación que se ha recibido del usuario.
 */
fun puntuacion(): Double? {
    println("Introduce tu puntuación de rendimiento: ")

    try {
        var rendimiento: Double?

        do {
            rendimiento = readln().toDoubleOrNull()

            if (rendimiento == null || rendimiento !in listOf(0.0, 0.4, 0.6)) {
                println("Debes introducir una de las tres opciones: \n0.0\n0.4\n0.6 o superior.")
            }
        } while (rendimiento == null || rendimiento < 0.0)

        return rendimiento
    } catch (e: NumberFormatException) {
        println("Introduce un número válido")
        return null
    }
}

/**
 * @return Devuelve el nombre del nivel del usuario según su puntuación.
 */
fun nivelRend(rendimiento: Double?): String {
    return when {
        rendimiento == null -> "No se proporcionó una puntuación válida"
        rendimiento <= 0.0 -> "Inaceptable"
        rendimiento <= 0.4 -> "Aceptable"
        else -> "Meritorio"
    }
}

/**
 * @return Devuelve el valor del beneficio según el rendimiento que ha tenido el usuario.
 */
fun calcBeneficio(rendimiento: Double?): Double {
    val rendimientoNoNulo = rendimiento ?: 0.0
    return rendimientoNoNulo * 2400
}

/**
 * @return Devuelve el calculo sencillo de multiplicar el salario por su puntuación.
 */
fun totalbenef(beneficio: Double): Double{
    val total = beneficio + 2400.0
    return total
}
fun main(){
    val puntos = puntuacion()
    val rendimiento = nivelRend(puntos)
    val beneficio = calcBeneficio(puntos)

    println("Para tu rendimeinto $rendimiento, con puntuacion $puntos, vas a recibir una bonificación de: $beneficio.\n" +
            "Haciendo un total de: ${String.format("%.2f",totalbenef(beneficio))}€")
}