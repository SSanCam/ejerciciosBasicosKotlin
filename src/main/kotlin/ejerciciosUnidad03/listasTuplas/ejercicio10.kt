package ejerciciosUnidad03.listasTuplas
/*Escribir un programa que almacene en una lista los siguientes precios: 50, 75, 46, 22, 80, 65, 8 y muestre
por pantalla el menor y el mayor de los precios.*/
fun main() {
    val listaPrecios = listOf(50, 75, 46, 22, 80, 65, 8)

    println("El número mayor: ${listaPrecios.max()}\n" +
            "El número menor es: ${listaPrecios.min()}")
}