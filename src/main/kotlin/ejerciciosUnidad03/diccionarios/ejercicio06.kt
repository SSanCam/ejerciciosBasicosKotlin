package ejerciciosUnidad03.diccionarios
/*
Ejercicio 3.2.6¶
Escribir un programa que cree un diccionario vacío y lo vaya llenado con información sobre una persona
(por ejemplo nombre, edad, sexo, teléfono, correo electrónico, etc.) que se le pida al usuario.
Cada vez que se añada un nuevo dato debe imprimirse el contenido del diccionario.
*/
fun main() {
    val agenda = mutableMapOf("Nombre" to "", "Edad" to "", "Sexo" to "", "Teléfono" to "", "Correo electrónico" to "")
    var seguir = true
    try {

        while (seguir) {
            for (dato in agenda.keys) {
                println("Ingresa: $dato")
                val valor = readln()
                agenda[dato] = valor
                println(agenda)
            }
            println("Quieres igresar otro contacto? S/N")
            val otro = readln()
            if (otro.uppercase() == "N"){
                seguir = false
            }else{
                continue
            }
        }

    } catch (e: IllegalArgumentException) {
        println("ERROR - 404")
    }

}