package ejerciciosUnidad03.conjuntos
/*
Dado el conjunto de letras:

vocales = {'a', 'e', 'i', 'o', 'u'}
Crea un conjunto consonantes que contenga las letras del alfabeto que no son vocales.
Crea un conjunto letras_comunes que contenga las letras que están tanto en el conjunto vocales como en el conjunto consonantes.
 */
fun main () {

    val vocales = setOf('a','e','i','o','u')
    val abecedario = 'a'..'z'
    val consonantes = abecedario.minus(vocales)
    val letrasComunes = vocales.intersect(consonantes.toSet())

    println("Abecedario: $abecedario")
    println()
    println("Vocales: $vocales")
    println("Consonantes: $consonantes")
    println("Letras comunes: $letrasComunes")
}