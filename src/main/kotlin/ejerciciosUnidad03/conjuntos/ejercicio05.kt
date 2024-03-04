package ejerciciosUnidad03.conjuntos
/*
Dado el conjunto de números enteros:

numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
Crea un conjunto pares que contenga los números pares del conjunto numeros.
Crea un conjunto multiplos_de_tres que contenga los números que son múltiplos de tres del conjunto numeros.
Encuentra la intersección entre los conjuntos pares y multiplos_de_tres y guárdala en un conjunto llamado pares_y_multiplos_de_tres.
 */

fun main () {
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // Sacamos los números pares del set numeros
    val numerosPares = numeros.filter { it % 2 == 0  }.toSet()
    // Sacamos los múltiplos de tres del conjunto numeros
    val multiplosDeTres = numeros.filter { it % 3 == 0 }.toSet()
    // Sacamos los números pares que sean múltiplo de 3
    val paresMultiplosTres = multiplosDeTres.intersect(numerosPares)

    println("Dado el conjunto de números: $numeros")
    println()
    println("Los números pares son: $numerosPares")
    println("Los números múltiplos de 3 son: $multiplosDeTres")
    println("Los números múltiplos de 3 que son pares son: $paresMultiplosTres")
}