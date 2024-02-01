package ejerciciosUnidad02.sentenciasIterativas

/*Ejercicio 2.2.19¶
Mostrar un menú con tres opciones:
1- comenzar programa
2- imprimir listado
3-finalizar programa.
A continuación, el usuario debe poder seleccionar una opción (1, 2 ó 3). Si elige una opción incorrecta,
informarle del error. El menú se debe volver a mostrar luego de ejecutada cada opción, permitiendo volver a elegir.
Si elige las opciones 1 ó 2 se imprimirá un texto. Si elige la opción 3, se interrumpirá la impresión del menú
y el programa finalizará.
*/
fun main() {
    val op1 = "Comenzar programa."
    val op2 = "Imprimir listado."
    val op3 = "Finalizar programa."
    val listadoProgramas = mutableListOf<String>()
    try {
        val mensaje = ("Menú de opciones:\n1.-$op1\n2.-$op2\n3.-$op3")
        println(mensaje)
        println("Introduce el número correspondiente a la opción que quieras realizar: ")
        var opcionElegida = readln().toInt()

        while (opcionElegida !in 1..3){
            println("Esa elección no se encuentra entre las opciones válidas.\nInténtalo de nuevo: ")
            opcionElegida = readln().toInt()
        }
        while (opcionElegida != 3){
            if (opcionElegida == 1){
                println("Introduce el nombre de tu programa")
                val nombreProg = readln()
                listadoProgramas.add(nombreProg)
                Thread.sleep(200)
            }else if (opcionElegida == 2){
                println(listadoProgramas)
                Thread.sleep(200)
            }
            println(mensaje)
            opcionElegida = readln().toInt()

            if (opcionElegida == 3){
                println("Saliendo del programa.")
                Thread.sleep(200)
            }
        }
    }catch (e: NumberFormatException){
        println("Opcoón no disponible.")
    }
}