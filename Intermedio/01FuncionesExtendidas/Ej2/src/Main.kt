//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val cadena = "hOla MUNdo"
    println(cadena.camelCase())

    val listaNumeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val listaCadena = listOf("uno", "dos", "tres", "cuatro", "cinco")

    println("Lista numérica filtrada por pares: ${listaNumeros.filtrarPares()}")
    println("Lista numérica filtrada por pares: ${listaNumeros.filtrarImpares()}")
    println("Lista de palabras filtrada por palabras de mas de 3 letras: ${listaCadena.filtrarLista({ it.length > 3 })}")
}

fun String.camelCase(): String {
    // Convertimos la cadena a minúsculas
    return this.lowercase()
        // Eliminamos los espacios
        .split(" ")
        // Unimos ambas palabras y convertimos la primera letra de cada palabra a mayúscula
        .joinToString("") { it.replaceFirstChar { char -> char.uppercase() } }
        // Convertimos la primera letra a minúscula
        .replaceFirstChar { it.lowercase() }
}

fun List<Int>.filtrarPares(): List<Int> = this.filtrarLista { it % 2 == 0 }

fun List<Int>.filtrarImpares(): List<Int> = this.filtrarLista { it % 2 != 0 }

// Función generica para filtrar listas
fun <T> List<T>.filtrarLista(criterio: (T) -> Boolean): List<T> = this.filter(criterio)
