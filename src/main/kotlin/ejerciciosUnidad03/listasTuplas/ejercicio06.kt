package ejerciciosUnidad03.listasTuplas

/*
Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, Química, Historia
y Lengua) en una lista, pregunte al usuario la nota que ha sacado en cada asignatura y elimine de la lista las
asignaturas aprobadas. Al final el programa debe mostrar por pantalla las asignaturas que el usuario tiene que repetir.
*/
fun main() {

    try {

        val materias = mutableListOf("Matemáticas", "Física", "Química", "Historia", "Lengua")
        val notas = mutableListOf<Double>()

        for (nota in materias) {
            println("Introduce tu nota en $nota: ")
            val nota = readln().toDoubleOrNull() ?: throw IllegalArgumentException("Entrada incorrecta")
            notas.add(nota)
        }

        val suspendidas = mutableListOf<String>()

        for (i in 0 until materias.size) {
            val examen = materias[i]
            val nota = notas[i]

            if (nota < 5) {
                suspendidas.add(examen)
            }
        }
        println("Debes recuperar los siguientes módulos: $suspendidas")

    } catch (e: NumberFormatException) {
        println(e.message)
    }

}