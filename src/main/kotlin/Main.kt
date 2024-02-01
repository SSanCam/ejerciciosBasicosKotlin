fun crearTablero(): MutableList<MutableList<String>> {
    val tablero = mutableListOf<MutableList<String>>()

    for (fila in 1..3) {
        val filaTablero = mutableListOf<String>()
        for (columna in 1..3) {
            filaTablero.add(" _ ")  // Inicializar cada celda con un espacio en blanco
        }
        tablero.add(filaTablero)
    }

    return tablero
}
fun colocarFicha(tablero: MutableList<MutableList<String>>, fila: Int, columna: Int, ficha: String): Boolean {
    // Verificar si la posición está dentro de los límites del tablero
    if (fila !in 1..3 || columna !in 1..3) {
        println("Posición inválida. Las filas y columnas deben estar entre 1 y 3.")
        return false
    }

    // Verificar si la casilla está libre
    if (tablero[fila - 1][columna - 1] == " ") {
        tablero[fila - 1][columna - 1] = ficha
        return true
    } else {
        println("La casilla ya está ocupada. Elige otra posición.")
        return false
    }
}

fun imprimirTablero(tablero: List<List<String>>) {
    for (fila in tablero) {
        println(fila.joinToString("|"))
    }
}

fun main() {
    val tablero = crearTablero()

    // Imprimir el tablero inicial
    println("Tablero inicial:")
    imprimirTablero(tablero)

    // Jugadores
    val jugadores = listOf("x", "o")
    val movimientosMaximos = 3
    var movimientosRealizados = 0

    // Bucle de juego
    while (movimientosRealizados < movimientosMaximos * jugadores.size) {
        val jugadorActual = jugadores[movimientosRealizados % jugadores.size]

        println("\nTurno del jugador $jugadorActual")
        print("Ingrese la fila (1-3): ")
        val fila = readLine()?.toIntOrNull()
        print("Ingrese la columna (1-3): ")
        val columna = readLine()?.toIntOrNull()

        if (fila != null && columna != null) {
            val exito = colocarFicha(tablero, fila, columna, jugadorActual)
            if (exito) {
                movimientosRealizados++
                println("\nTablero después del movimiento:")
                imprimirTablero(tablero)
            }
        } else {
            println("Entrada inválida. Ingresa números para la fila y la columna.")
        }
    }

    println("\nFin del juego. Todos los movimientos se han realizado.")
}
