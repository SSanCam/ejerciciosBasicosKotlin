package ejerciciosUnidad03.diccionarios

/*
Ejercicio 3.2.7¶
Escribir un programa que cree un diccionario simulando una cesta de la compra.
El programa debe preguntar el artículo y su precio y añadir el par al diccionario, hasta que el usuario decida terminar.
Después se debe mostrar por pantalla la lista de la compra y el coste total, con el siguiente formato

Lista de la compra
Artículo 1	Precio
Artículo 2	Precio
Artículo 3	Precio
…	…
Total	Coste
*/
fun main() {
    val recibo = mutableMapOf<String, Double>()
    var precioTotal = 0.0
    var seguir = true

    while (seguir) {
        println("Introduce el nombre del articulo: ")
        val articulo = readln()

        println("Introduce su precio: ")
        val precio = readln().toDouble()

        recibo[articulo] = precio
        precioTotal += precio

        println("¿Quieres terminar? S/N")
        val terminar = readln().uppercase()
        if (terminar == "S"){
            seguir = false

        }else{
            continue
        }
    }

    println("Lista de la compra:")
    for ((articulo, precio) in recibo){
        println("$articulo $precio")
    }
    println("'''  '''")
    println("Total: $precioTotal")

}