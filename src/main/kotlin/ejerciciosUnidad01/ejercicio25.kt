package org.example.ejerciciosUnidad01

/*Escribir un programa que pregunte al usuario la fecha de su nacimiento en formato dd/mm/aaaa y muestra por pantalla,
el día, el mes y el año. Adaptar el programa anterior para que también funcione cuando el día o el mes se introduzcan
con un solo carácter.*/
/**
 * @return Bloque de texto indicando día, mes y año.
 */
fun pedirCumple() {
    try {
        println("Introduce la fecha de tu cumpleaños con el formato dd/mm/aaaa")
        var fecha = readLine()

        if (!fecha.isNullOrBlank()) {
            val partes = fecha.split("/")
            while (partes.size != 3){
                println("Inténtalo de nuevo.\n" +
                        "Introduce la fecha de tu cumpleaños con el formato dd/mm/aaaa")
                fecha = readLine()
            }
            if (partes.size == 3) {
                var dia = partes[0].padStart(2, '0').toIntOrNull()
                var mes = partes [1].padStart(2, '0').toIntOrNull()
                var anio = partes [2].toIntOrNull()

                while (dia == null || dia !in 1..31){
                    println("Error en el dia.\nIntroduce un numero entre 1 y 31: ")
                    dia = readln().toIntOrNull()
                }
                while (mes == null || mes !in 1..12){
                    println("Error en el mes.\nIntroduce un numero entre 1 y 12: ")
                    mes = readln().toIntOrNull()
                }

                while (anio == null || anio !in 1900..2024) {
                    println("Error en el año.\nIntroduce el año de nuevo: ")
                    anio = readln().toIntOrNull()
                }

                //febrero
                /*
                val esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)

                while (mes == 2){
                    if (esBisiesto && (dia ?: 0) > 29){
                        println("Error en el día.\nDebes introducir un número entre 1 y 29: ")
                        dia = readln().toIntOrNull()
                    }else if (!esBisiesto && (dia ?: 0) > 28){
                        println("Error en el día. Debes introducir un número entre 1 y 28: ")
                        dia = readln().toIntOrNull()
                    }

                }
                */


                val cumpleanios = println("Tu cumpleaños es el dia: $dia del mes $mes del año $anio")
                return cumpleanios
            }
        }else{
            println("Formato de fecha erróneo.")
        }
    }catch (e: NumberFormatException){
        println("ERRO de formato.")
    }
}

fun main() {
    pedirCumple()
}