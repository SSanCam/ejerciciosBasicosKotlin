package ejerciciosUnidad03.diccionarios
/*
Escribir un programa que cree un diccionario de traducción español-inglés. El usuario introducirá las palabras en
español e inglés separadas por dos puntos, y cada par <palabra>:<traducción> separados por comas. El programa debe
crear un diccionario con las palabras y sus traducciones. Después pedirá una frase en español y utilizará el diccionario
para traducirla palabra a palabra. Si una palabra no está en el diccionario debe dejarla sin traducir.
*/
fun main() {

    val dicEspIng = mutableMapOf<String, String>()
    var seguir = true

    while (seguir) {

        println(
            "Introduce una palabra en español y su traducción en inglés de la siguiente forma:\n" +
                    "palabra:traducción"
        )
        val palabras = readln().split(":").toMutableList()
        if (palabras.size == 2) {
            dicEspIng[palabras[0].trim()] = palabras[1].trim()
        } else {
            println("Formato incorrecto. Debes ingresar palabra:traducción")
        }

        println("¿Otra palabra? S/N")
        val continuar = readln().uppercase()
        if (continuar == "N") {
            seguir = false
        } else if (continuar == "S") {
            continue
        } else {
            println("Dato introducido erróneo.")
        }
    }

    val palabrasDiccionario = dicEspIng.keys.toSet()

    println("Indica la frase en español quieres traducir a inglés: ")
    val fraseTraducir = readln().split(" ")

    for (palabra in fraseTraducir) {

        if (palabra.trim() !in palabrasDiccionario) {
            println("Lo siento, '${palabra}' no se encuentra actualmente en nuestro diccionario.")
        }else{
            val fraseTraducida = dicEspIng[palabra.trim()]

        }
        println("La traducción de '${fraseTraducir}' sería: '${fraseTraducida}'")
    }

}


