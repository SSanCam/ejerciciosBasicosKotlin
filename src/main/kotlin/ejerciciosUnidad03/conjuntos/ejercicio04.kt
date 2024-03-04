package ejerciciosUnidad03.conjuntos
/*
Dadas las siguientes listas:

frutas1 = ["manzana", "pera", "naranja", "plátano", "uva"]
frutas2 = ["manzana", "pera", "durazno", "sandía", "uva"]

Crea conjuntos a partir de estas listas y nómbralos set_frutas1 y set_frutas2.

Encuentra las frutas que están en ambas listas y guárdalas en un nuevo conjunto llamado frutas_comunes.
Encuentra las frutas que están en frutas1 pero no en frutas2 y guárdalas en un conjunto llamado frutas_solo_en_frutas1.
Encuentra las frutas que están en frutas2 pero no en frutas1 y guárdalas en un conjunto llamado frutas_solo_en_frutas2.
 */

fun main() {
    // Dos listas de fruta.
    val frutas1 = listOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = listOf("manzana", "pera", "durazno", "sandía", "uva")
    // Las convertimos a set
    val setFrutas1 = frutas1.toSet()
    val setFrutas2 = frutas2.toSet()
    // Realizamos las separaciones que nos piden.
    val frutasComunes = setFrutas1.intersect(setFrutas2)
    val soloFrutasEn1 = setFrutas1.minus(frutas2)
    val soloFrutasEn2 = setFrutas2.minus(frutas1)
    // Imprimimos las distintas informaciones
    println("Frutas del set 1: $setFrutas1")
    println("Frutas en el ser 2: $setFrutas2")
    println()
    println("Frutas comunes: $frutasComunes")
    println("Frutas1 que no aparecen en frutas2: $soloFrutasEn1")
    println("Frutas2 que no aparecen en frutas1: $soloFrutasEn2")
}