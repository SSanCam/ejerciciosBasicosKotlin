package ejerciciosUnidad03.conjuntos
/*
El conjunto potencia de un conjunto S es el conjunto de todos los subconjuntos de S.

Por ejemplo, el conjunto potencia de {1,2,3} es:

{∅,{1},{2},{3},{1,2},{1,3},{2,3},{1,2,3}}
Escriba la función conjunto_potencia(s) que reciba como parámetro un conjunto cualquiera s y retorne su «lista potencia»
(la lista de todos sus subconjuntos):

>>> conjunto_potencia({6, 1, 4})
[set(), set([6]), set([1]), set([4]), set([6, 1]), set([6, 4]), set([1, 4]), set([6, 1, 4]
*/
/**
 * Función que calcula el conjunto potencia de un conjunto dado.
 * El conjunto potencia de un conjunto S es el conjunto de todos los subconjuntos de S.
 *
 * Por ejemplo, el conjunto potencia de {1, 2, 3} es:
 * {∅, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}
 *
 * @param s Conjunto de enteros del cual se calculará el conjunto potencia.
 * @return Conjunto de todos los subconjuntos de 's', incluido el conjunto vacío.
 */
fun conjuntoPotencia(s: Set<Int>): Set<Set<Int>> {
    // Se inicializa el conjunto vacío
    var potencia = setOf<Set<Int>>(setOf())
    // Se itera por los elementos del conjunto 's'
    for (elemento in s){
        val nuevoConjunto = potencia.map { it + elemento }
        // Actualizamos 'potencia' agregando los nuevos conjuntos
        potencia = potencia + nuevoConjunto
    }
    return potencia
}

/**
 * Programa principal que muestra el cálculo del conjunto potencia.
 */
fun main() {
    val conjunto = setOf(6,1,4)
    val potencia = conjuntoPotencia(conjunto)
    println(potencia)
}