package org.example.ejerciciosUnidad01
/*Escribir un programa que pregunte por consola por los productos de una cesta de la compra, separados por comas,
y muestre por pantalla cada uno de los productos en una línea distinta.*/
fun listaCompra(): Unit{
    try {
        println("Introduce, separados por comas, todos los articulos de la cesta: ")
        val listaCompleta = readln().toString().split(",")
        println("Los articulos han sido: \n")
        for (articulo in listaCompleta){
            println("${articulo.capitalize()}")
        }
    }catch (e: Exception){
        println("ERROR - 404")
    }
}

fun main() {
    listaCompra()
}