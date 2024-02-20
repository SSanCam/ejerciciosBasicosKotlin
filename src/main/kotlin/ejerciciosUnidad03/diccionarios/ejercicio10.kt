package ejerciciosUnidad03.diccionarios
/*
Escribir un programa que permita gestionar la base de datos de clientes de una empresa.
Los clientes se guardarán en un diccionario en el que la clave de cada cliente será su NIF,
y el valor será otro diccionario con los datos del cliente (nombre, dirección, teléfono, correo, preferente),
donde preferente tendrá el valor True si se trata de un cliente preferente.

El programa debe preguntar al usuario por una opción del siguiente menú:
    (1) Añadir cliente,
    (2) Eliminar cliente,
    (3) Mostrar cliente,
    (4) Listar todos los clientes,
    (5) Listar clientes preferentes,
    (6) Terminar.

En función de la opción elegida el programa tendrá que hacer lo siguiente:
    Preguntar los datos del cliente, crear un diccionario con los datos y añadirlo a la base de datos.
    Preguntar por el NIF del cliente y eliminar sus datos de la base de datos.
    Preguntar por el NIF del cliente y mostrar sus datos.
    Mostrar lista de todos los clientes de la base datos con su NIF y nombre.
    Mostrar la lista de clientes preferentes de la base de datos con su NIF y nombre.
    Terminar el programa.
*/



fun espacio() {
    println()
}

val baseDeDatosClientes = mutableMapOf<String, MutableMap<String, Any>>()

//METODOS PARA EL PROGRAMA DE LA BASE DE DATOS:
fun agregarCliente() {
    println("Introduce el DNI del nuevo cliente: ")
    val dni = readln()
    println("Introduce tu nombre: ")
    val nombre = readln()
    println("Introduce tu direccion: ")
    val direccion = readln()
    println("Introduce tu número de teléfono: ")
    val telefono = readln()
    println("Es preferente? 'si' / 'no' : ")
    var preferente = readlnOrNull().toBoolean()
    if (preferente.toString().lowercase() == "si") {
        preferente = true
    } else if (preferente.toString().lowercase() == "no") {
        preferente = false
    }
    val datosCliente = mutableMapOf<String, Any>()
    datosCliente["nombre"] = nombre
    datosCliente["direccion"] = direccion
    datosCliente["telefono"] = telefono
    datosCliente["preferente"] = preferente

    baseDeDatosClientes[dni] = datosCliente
    println("Cliente agregado correctamente.")

}

fun eliminarCliente() {
    println("Introduce el DNI del cliente que deseas eliminar: ")
    val dni = readlnOrNull().toString()

    if (baseDeDatosClientes.containsKey(dni)) {
        baseDeDatosClientes.remove(dni)
        println("Cliente con DNI $dni eliminado de la base de datos.")
    } else {
        println("No se encontró ningún cliente con el DNI $dni en la base de datos.")
    }
    println("Cliente eliminado correctamente.")
}

fun mostrarClientes() {
    println("Introduce el dni del cliente que quieres mostrar: ")
    val dni = readln()

    if (baseDeDatosClientes.containsKey(dni)) {
        val cliente = baseDeDatosClientes[dni]
        println("Datos del cliente con DNI $dni:")
        cliente?.forEach { (key, value) ->
            println("$key: $value")
        }
    }
}
g
fun listarClientes() {
    println("El listado de los clientes: ")
    baseDeDatosClientes.forEach { (dni, datosClientes) ->
        val nombre = datosClientes["nombre"]
        println("DNI: $dni - Nombre: $nombre")
    }
}

fun listarPreferentes() {
    println("Listado clientes preferentes: ")
    baseDeDatosClientes.filterValues { it["preferente"] == true }.forEach { (dni, datosCliente) ->
        val nombre = datosCliente["nombre"]
        println("DNI: $dni - Nombre: $nombre")
    }
}

fun mostrarMenu() {
    var opcion: Int

    do {
        val menu = ("Menú principal:\n1.- Añadir cliente.\n2.- Eliminar cliente\n3.- Mostrar clientes\n" +
                "4.- Listar todos los clientes\n5.- Listar clientes preferentes\n6.- Terminar.")
        println(menu)
        espacio()
        println("Ingresa el número correspondiente a tu opción: ")
        opcion = readln().toInt()

        when (opcion) {
            1 -> agregarCliente()
            2 -> eliminarCliente()
            3 -> mostrarClientes()
            4 -> listarClientes()
            5 -> listarPreferentes()
            6 -> println("Saliendo del programa.")
            else -> println("Opción inválida.")
        }
        espacio()
    } while (opcion != 6)
}


fun main() {
    println("¡Bienvenido al sistema de gestión de clientes!")
    espacio()
    mostrarMenu()
}