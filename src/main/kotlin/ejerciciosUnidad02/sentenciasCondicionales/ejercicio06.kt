package org.example.ejerciciosUnidad02.sentenciasCondicionales

/*Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre. El grupo A esta formado
por las mujeres con un nombre anterior a la M y los hombres con un nombre posterior a la N y el grupo B por el resto.
Escribir un programa que pregunte al usuario su nombre y sexo, y muestre por pantalla el grupo que le corresponde.*/
/**
 * @return Devuelve la inicial del sexo ingresado por el usuario.
 */
fun pedirSex(): String{
    try {
        println("Introduce tu sexo: H/M\n")
        var sex = readln().uppercase()

        while (sex.uppercase() != "M" && sex.uppercase() != "H"){
            println("ERROR. Debes introducir \'H\' o \'M\'")
            sex = readln()
        }
        return sex

    }catch (e: Exception){
        println("Error en la lectura de datos.")
        return ""
    }
}

/**
 * @return Devuelve el nombre pedido al usuario.
 */
fun pedirNombre(): Char {
    try {
        println("Introduce tu nombre: ")
        var nombre = readln().uppercase()

        while (nombre == null){
            println("ERROR. Inténta introducir tu nombre de nuevo: ")
            nombre = readln()
        }
        return nombre[0]
    }catch (e: Exception){
        println("Error en la lectura de datos.")
        return 'O'
    }
}

/**
 * @return Devuelve el grupo al que pertenece la persona, según los datos recibidos.
 */
fun ejCond06(sexo: String, nombre: Char): String{

    try {
        var grupo = ""

        grupo = if (sexo == "M" && nombre < 'M'){
            "Tu grupo es el A"
        }else if(sexo == "H" && nombre > 'N'){
            "Tu grupo es el A"
        }else{
            "Tu grupo es el B"
        }
        return  grupo

    }catch (e: Exception){
        println("ERROR - 404")
        return ""
    }
}

/**
 * @return Devuelve el resultado de las funciones anteriores.
 */
fun main() {
    return println(ejCond06(pedirSex(), pedirNombre()))
}