package org.example.ejerciciosUnidad01

/*Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés al año. Estos ahorros debido a
intereses, que no se cobran hasta finales de año, se te añaden al balance final de tu cuenta de ahorros. Escribir un
programa que comience leyendo la cantidad de dinero depositada en la cuenta de ahorros, introducida por el usuario.
Después el programa debe calcular y mostrar por pantalla la cantidad de ahorros tras el primer, segundo y tercer años.
Redondear cada cantidad a dos decimales.

Calcula el interés: capital * (1 + interes)*/

fun cuentaAhorros (): Double{
    println("Introduce la cantidad de tu cuenta de ahorros: ")
    var depostAhorro = readln().toDoubleOrNull()
    try {
        while (depostAhorro !is Double){
            println("Inténtalo de nuevo.\nIntrodice la cantidad de tu cuenta de ahorros: ")
            depostAhorro = readln().toDoubleOrNull()
    }
    return depostAhorro
    }catch(e: NumberFormatException){
        println("ERROR - 404")
        return 0.0
    }
}

fun ahorrosAnual(capital: Double): Unit{

        var capitalActual = capital
        val intereses = mutableListOf<String>()

    for (anio in  1..3){
        capitalActual *= ( 1 + 0.04)
        intereses.add(String.format("%.2f",capitalActual))
    }

    val resultado = println("Para tu capital de $capital€.\n\n" +
            "Tras el primner año se obtedrá finalmente : ${intereses[0]}€.\n" +
            "Tras el segundo año: ${intereses[1]}€.\n" +
            "Tras el tercero: ${intereses[2]}€")
    return resultado
}

fun main(){
    ahorrosAnual(cuentaAhorros())
}