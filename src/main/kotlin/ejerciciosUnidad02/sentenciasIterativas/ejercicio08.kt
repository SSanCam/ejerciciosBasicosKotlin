package ejerciciosUnidad02.sentenciasIterativas

/*Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo
como el de más abajo.

1
3 1
5 3 1
7 5 3 1
9 7 5 3 1
*/


fun triangNums(numeros: Int) {
    for (i in 1..numeros) {
        var linea = ""
        for (j in i * 2 - 1 downTo 1 step 2) {
            linea += "$j "
        }
        println(linea.trim())
    }
}
fun main(){
    println("Introduce un número para hacer el triángulo numérico")
    val numero = pedirNum()
    println(triangNums(numero))

}