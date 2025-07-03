//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val listaTareas = mutableListOf("Comprar pan", "Hacer ejercicio", "Estudiar Kotlin")
    var opcion: Int

    do {
        println("1.- Agregar tarea")
        println("2.- Ver tareas")
        println("3.- Eliminar tarea")
        println("4.- Salir")

        println("Que opción desea realizar?")
        opcion = readln().toInt()

        if (opcion < 1 || opcion > 4) {
            println("Opción no válida, por favor intente de nuevo.")
        } else {
            opcionElegida(opcion, listaTareas)
        }

        if (opcion == 4) {
            println("Saliendo del programa...")
        }

    } while (opcion != 4)
}

fun opcionElegida(opcion: Int, listaTareas: MutableList<String>) {
    when (opcion) {
        1 -> agregarTarea(listaTareas)
        2 -> verTareas(listaTareas)
        3 -> eliminarTarea(listaTareas)
    }
}

fun agregarTarea(listaTareas: MutableList<String>) {

    var nuevaTarea: String
    var existeTarea = false

    do {
        println("Nombre de la nueva tarea:")
        nuevaTarea = readln()

        for (tarea in listaTareas) {
            if (tarea == nuevaTarea) {
                println("Tarea existente, no se puede agregar.")
                existeTarea = true
            }
        }
    } while (existeTarea)
}

fun verTareas(listaTareas: MutableList<String>) {
    if (listaTareas.isEmpty()) {
        println("No hay tareas para mostrar.")
    } else {
        println("Lista de tareas:")
        for (tarea in listaTareas) {
            println("- $tarea")
        }
    }
}

fun eliminarTarea(listaTareas: MutableList<String>): String {

    var existe = false
    var mensaje = ""

    if (listaTareas.isEmpty()) {
        println("No existen tareas para eliminar.")
    } else {
        println("Nombre de la tarea a eliminar:")
        val eliminar = readln()

        for (tarea in listaTareas) {
            if (tarea.lowercase() == eliminar.lowercase()) {
                listaTareas.remove(tarea)
                existe = true
            } else {
                existe = false
            }
        }

        mensaje = if (existe) {
            "Tarea eliminada correctamente."
        } else {
            "Tarea no encontrada"
        }
    }

    return mensaje
}