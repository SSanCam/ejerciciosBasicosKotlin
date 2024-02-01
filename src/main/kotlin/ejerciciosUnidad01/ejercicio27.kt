package org.example.ejerciciosUnidad01

/*Escribir un programa que pregunte el nombre el un producto, su precio y un número de unidades y muestre por pantalla
una cadena con el nombre del producto seguido de su precio unitario con 6 dígitos enteros y 2 decimales, el número de
unidades con tres dígitos y el coste total con 8 dígitos enteros y 2 decimales.*/
fun nomProd(): String?{
    try {
        println("Introduce el nombre del producto: ")
        var nombre = readlnOrNull()

        while (nombre == null){
            println("Introduce de nuevo el nombre del producto: ")
            nombre = readlnOrNull()
        }
        return nombre
    }catch (e: NumberFormatException){
        println("Error en la lectura de datos.")
        return null
    }
}

fun precioUni(): Double? {
    try {
        println("Introduce el precio del producto: ")
        var precio = readln().toDoubleOrNull()

        while (precio == null){
            println("Introduce de nuevo el precio del producto: ")
            precio = readln().toDoubleOrNull()
        }
        return precio

    }catch (e: NumberFormatException){
        println("Error en la lectura de datos.")
        return null
    }

}


fun numUni(): Int? {
    try {

        println("Introduce el número de unidades que quiera: ")
        var unidades = readln().toIntOrNull()
        while (unidades == null){
            println("Introduce de nuevo el número de unidades que quiera: ")
            unidades = readln().toIntOrNull()
        }
        return unidades

    }catch (e: NumberFormatException){
        println("Error en la lectura de datos.")
        return null
    }

}

fun costTotal(precio: Double, unidades: Int): Double {
    val costeFinal = precio * unidades
    return costeFinal
}
fun ticket(articulo: String?, unidades: Int?, precio: Double?) {

    val recibo = println("Las $unidades unidades de $articulo, a ${String.format("%.2f",precio)}€ cada unidad, hace un total de: ${String.format("%.2f",costTotal(precio!!.toDouble(),unidades!!.toInt()))}€")
    return recibo
}

fun main(){
    ticket(nomProd(), numUni(), precioUni())
}