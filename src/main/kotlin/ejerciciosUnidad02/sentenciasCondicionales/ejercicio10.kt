package org.example.ejerciciosUnidad02.sentenciasCondicionales

/*La pizzería Bella Napoli ofrece pizzas vegetarianas y no vegetarianas a sus clientes. Los ingredientes para cada
tipo de pizza aparecen a continuación.

Ingredientes vegetarianos: Pimiento y tofu.
Ingredientes no vegetarianos: Peperoni, Jamón y Salmón.
Escribir un programa que pregunte al usuario si quiere una pizza vegetariana o no, y en función de su respuesta le
muestre un menú con los ingredientes disponibles para que elija. Solo se puede eligir un ingrediente además de la
mozzarella y el tomate que están en todas la pizzas. Al final se debe mostrar por pantalla si la pizza elegida es
vegetariana o no y todos los ingredientes que lleva.*/


fun msjBienvenida(): String{
    val mensaje =("************************\n" +
            "   BIENVENIDO A \n" +
            "++PIZZERIA BELLA NAPOLI++\n" +
            "*************************\n" +
            "Nuestras pizzas llevan de base queso y tomate, elige qué otro ingrediente quieres.")

    return mensaje
}

fun tipoPizza(): String {
    try {
        println("Indica si quieres pizza vegetariana [V] o no vegetariana [NV]: ")
        var opPiz = readln().uppercase()
        val opc = listOf("V", "NV")

        while (opPiz !in opc) {

            println("Error. Debes elegir [V] vegetariana o [NV] no vegetariana: ")
            opPiz = readln().uppercase()

        }

        if (opPiz == "V") {
            opPiz = "vegetariana"
        }
        if (opPiz == "NV") {
            opPiz = "no vegetariana"
        }

        return opPiz

    } catch (e: Exception) {
        println("ERROR - 404")
        return ""
    }
}


    fun ingVeg(): String {

        try {
            println(
                "Has elegido la opción de pizza vegetariana.\nÉstos son los ingredientes:\n" +
                        "1.-Pimiento.\n2.-Tofu."
            )
            println("Introduce el número correspondiente al ingrediente que desees: ")
            var opIngVeg = readln()?.toIntOrNull()

            while (opIngVeg == null) {
                println(
                    "Debes elegir la opción 1 o 2:\n" +
                            "1.-Pimiento\n" +
                            "2.-Tofu\n" +
                            "Inserta el número de tu ingrediente: "
                )
                opIngVeg = readln().toInt()
            }
            var ingrediente = ""

            when (opIngVeg) {
                1 -> ingrediente = "Pimiento"
                2 -> ingrediente = "Tofu"
            }
            return ingrediente
        } catch (e: NumberFormatException) {
            println("ERROR EN BASE DATOS.")
            return ""
        }
    }

    fun ingNVeg(): String {
        try {
            println("Has elegido la opción de pizza NO vegetariana.")
            println(
                "El ingrediente a elegir puede ser:\n" +
                        "1.-Peperoni\n2.-Jamón\n3.-Salmón\nIntroduce el número del ingrediente deseado: "
            )
            var ingNVeg = readln()?.toIntOrNull()
            while (ingNVeg == null) {
                println(
                    "Debes introducir el número correspondiente al ingrediente que desees:\n" +
                            "1.-Peperoni\n2.-Jamón\n3.-Salmón\nIntroduce el número del ingrediente deseado: "
                )
                ingNVeg = readln().toInt()
            }
            var ingrediente = ""
            when (ingNVeg) {
                1 -> ingrediente = "Peperoni"
                2 -> ingrediente = "Jamón"
                3 -> ingrediente = "Salmón"
            }
            return ingrediente
        } catch (e: NumberFormatException) {
            println("ERROR EN BASE DE DATOS")
            return ""
        }

    }

    fun recibo(): Unit {
        val tipoPizza = tipoPizza()
        var ingrediente = ""

        if (tipoPizza == "vegetariana") {
            ingrediente = ingVeg()
        } else if (tipoPizza == "no vegetariana") {
            ingrediente = ingNVeg()
        }

        val resultado = println("Usted ha elegido una pizza $tipoPizza, con tomate, queso y $ingrediente")
        return resultado
    }


fun main(){
    println(msjBienvenida())
    println(recibo())
    Thread.sleep(200)
}

