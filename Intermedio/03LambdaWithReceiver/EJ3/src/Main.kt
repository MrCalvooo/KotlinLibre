//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val listaTareas = listOf<Tarea>(
        Tarea("Tarea 1", true, 1),
        Tarea("Tarea 2", false, 2),
        Tarea("Tarea 3", true, 3),
        Tarea("Tarea 4", false, 4),
        Tarea("Tarea 5", true, 5)
    )

    println(validarTareas(listaTareas))
}

data class Tarea(
    val titulo: String,
    val completada: Boolean,
    val prioridad: Int
)

fun validarTareas(lista: List<Tarea>): String {
    val copia = copiaTareas(lista)
    var mensaje = ""
    run {
        if (copia.isEmpty()) {
            println("No existen tareas en la lista")
        } else {
            copia.forEach {
                if (it.titulo.isEmpty()) {
                    mensaje = "La tarea '${it.titulo}' no tiene título"
                }

                if (!it.completada) {
                    mensaje = "${it.titulo} esta por completar"
                }
            }
        }.also {
            if (mensaje.isEmpty()) {
                mensaje = "Todas las tareas están completas y tienen título"
            }
        }
    }

    verTareas(copia)

    return mensaje
}

// Esta función recibe una lista de tareas y devuelve una copia de las 3 primeras tareas
fun copiaTareas(lista: List<Tarea>): List<Tarea> {
    // Creamos una copia de la lista de tareas
    val copia = mutableListOf<Tarea>()
    // Metemos en la copia las 3 primeras tareas de la lista
    for (i in 0..2) {
        copia.add(lista[i].copy())
    }
    return copia
}

fun verTareas(lista: List<Tarea>) {
    lista.forEach {
        println("Título: ${it.titulo}, Completada: ${it.completada}, Prioridad: ${it.prioridad}\n")
    }
}