package ejerciciosUnidad03.listasTuplas

/*Escribir un programa que pida al usuario una palabra y muestre por pantalla el número de veces que contiene cada vocal.*/
fun main() {

    var vocalA = 0
    var vocalE = 0
    var vocalI = 0
    var vocalO = 0
    var vocalU = 0

    try {
        println("Introduce una palabra: ")
        val palabra = readln()

        for (letra in palabra){
            if (letra.uppercase() == "A"){
                vocalA += 1
            }
            if (letra.uppercase() == "E"){
                vocalE += 1
            }
            if (letra.uppercase() == "I"){
                vocalI += 1
            }
            if (letra.uppercase() == "O"){
                vocalO += 1
            }
            if (letra.uppercase() == "U"){
                vocalU += 1
            }
        }
        println("En la palabra $palabra :\n" +
                "La letra 'A' ha aparecido: $vocalA veces\n" +
                "La letra 'E' ha aparecido: $vocalE veces\n" +
                "La letra 'I' ha aparecido: $vocalI veces\n" +
                "La letra 'O' ha aparecido: $vocalO veces\n" +
                "La letra 'U' ha aparecido: $vocalU veces")

    }catch (e: IllegalArgumentException){
        println("Error - 404")
    }
}
