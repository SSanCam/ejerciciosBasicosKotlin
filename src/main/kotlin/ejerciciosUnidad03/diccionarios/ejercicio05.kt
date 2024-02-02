package ejerciciosUnidad03.diccionarios

/*
Ejercicio 3.2.5¶
Escribir un programa que almacene el diccionario con los créditos de las asignaturas de un curso {'Matemáticas': 6,
'Física': 4, 'Química': 5} y después muestre por pantalla los créditos de cada asignatura en el formato <asignatura>
tiene <créditos> créditos, donde <asignatura> es cada una de las asignaturas del curso, y <créditos> son sus créditos.
Al final debe mostrar también el número total de créditos del curso.
*/
fun main() {
    val curso = mapOf("Matemáticas" to 6, "Física" to 4, "Química" to 5)
    var totalCreditos = 0

    for ((asignatura, creditos) in curso) {
        println("$asignatura tiene $creditos créditos")
        totalCreditos += creditos
    }
    println("Haciendo un total de: $totalCreditos créditos.")
}