package ejerciciosUnidad02.sentenciasIterativas
/*Ejercicio 2.2.13¶
Escribir un programa que muestre el eco de todo lo que el usuario introduzca hasta que el usuario escriba “salir” que terminará.
*/
fun main (){

    println("Éste programa repetirá todo lo que introduzcas, hasta que escribas la palabra \'salir\'")
    try {
        println("Tu palabra>")
        var palabraUser = readln()

        while (palabraUser.uppercase() != "SALIR"){
            println("ECO: $palabraUser")
            palabraUser = readln()
        }
        if (palabraUser.uppercase() == "SALIR"){
            println("Saliendo del programa...")
        }
    }catch (e: IllegalArgumentException){
        println("ERROR - 404")
    }
}