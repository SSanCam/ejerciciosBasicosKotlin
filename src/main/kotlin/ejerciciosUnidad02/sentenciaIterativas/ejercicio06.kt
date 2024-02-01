package org.example.ejerciciosUnidad02.sentenciaIterativas

/*Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el
de más abajo, de altura el número introducido.
*/

fun triangulo(num: Int): String{
    var triangulo = ""
    val copo = "*"
    var nivel = 1
    for (carc in 1..num){
        triangulo += copo.repeat(nivel) + ("\n")
        nivel += 1
    }
    return triangulo
}
fun main(){
    println("Introduce el número de niveles para tu triágulo.")
    val numeroIngresado = pedirNum()
    println(triangulo(numeroIngresado))
}