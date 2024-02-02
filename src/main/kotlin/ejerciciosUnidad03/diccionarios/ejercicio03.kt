package ejerciciosUnidad03.diccionarios

/*
Escribir un programa que guarde en un diccionario los precios de las frutas de la tabla, pregunte al usuario por una
fruta, un número de kilos y muestre por pantalla el precio de ese número de kilos de fruta.
Si la fruta no está en el diccionario debe mostrar un mensaje informando de ello.

Fruta	Precio
Plátano	1.35
Manzana	0.80
Pera	0.85
Naranja	0.70
*/

fun calcularPrecio(kilos: Double, precio: Double): Double {
    return (kilos * precio)
}


fun main() {
    val stock = mapOf("PLATANO" to 1.35, "MANZANA" to 0.80, "PERA" to 0.85, "NARANJA" to 0.70)
    val carrito = mutableListOf<String>()
    var articulo = ""

    println("En nuestra tienda puedes encontrar: ")
    for (fruta in stock.keys) {
        println(fruta)
    }
    var seguir = true
    while (seguir) {
        println("Indica un producto que desees comprar: ")
        println("Fruta>")
        articulo = readln().uppercase()

        while (articulo.uppercase() !in stock.keys) {
            println("No disponemos de ese articulo.\nInténtalo de nuevo: ")
            articulo = readln().uppercase()
        }

        carrito.add(articulo)

        println("Quieres introducir otra fruta al carrito? S/N: ")
        val continuar = readln().uppercase()

        if (continuar == "N") {
            seguir = false
        } else if (continuar == "S") {
            continue
        } else {
            println("Debes introducir S o N: ")
        }

    }
    var totalCarrito = 0.0
    for (fruta in carrito) {
        println("Cuantos kilos de $fruta quieres?: ")
        val kilos = readln().toDouble()

        val precioUnitario = stock[fruta]
        val precioTotalFruta = calcularPrecio(kilos, precioUnitario!!.toDouble())
        totalCarrito += precioTotalFruta
        println("Precio total por ${kilos}kg de $fruta: $precioTotalFruta")
    }
    println("El total del carrito es: $totalCarrito")
}