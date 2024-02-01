package ejerciciosUnidad03.listasTuplas

/*Escribir un programa que pregunte al usuario los números ganadores de la lotería primitiva, los almacene en una lista
y los muestre por pantalla ordenados de menor a mayor.*/

/**
 * @return devuelve los números,ordenados, del boleto ingresados por el usuario.
 */
fun numsBoleto(): List<Int>{
    try {
        val nums = mutableListOf<Int>()

        while (nums.size < 6){
            println("Numero> ")
            val num = readln().toIntOrNull()

            try {
                if (num != null && num > 0 && num in 1..49 && num !in nums) {
                    nums.add(num)
                } else {
                    println("Inténtalo de nuevo.\nIngresa un número entero mayor de 0.")
                }
            } catch (e: NumberFormatException) {
                println("Inténtalo de nuevo.\nIngresa un número entero válido.")
            }
        }

        nums.sort()
        return nums

    }catch (e: NumberFormatException){
        println("Debes ingresar 8 números enteros positivos.")
        return emptyList()
    }
}

/**
 * @return Devuelve el número reintegro introducido por el usuario.
 */
fun reintegro(): Int{
    println("Número: ")
    var reintegro = readln()
    try {
        while (reintegro.toInt() == null && reintegro.toInt() in 1..9){
            println("Error\nInténtalo de nuevo: ")
            reintegro = readln()
        }
        return reintegro.toInt()
    }catch (e: NumberFormatException){
        println("ERROR\nIntroduce un núnmero entero positivo.")
        return 0
    }
}

/**
 * @return Los números ordenados ingresados por el usuario más el reintegro.
 */
fun imprimirBoleto(numeros: List<Int>, reintegro: Int){
    println("Tu boleto ordenado es:\n$numeros - $reintegro")
}

fun main(){
    println("Un boleto de loteria se compone de 6 números enteros positivos, entre 1-49, y un reintegro, entre 1-9.")

    println(">>Ingresa los números de tu boleto para poder ordenarlos.\n")
    val numeros = numsBoleto()
    println(">>Ingresa tu número reintegro: ")
    val reintegro = reintegro()

     println(imprimirBoleto(numeros, reintegro))
}