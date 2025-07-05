//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val cadena = "Hola Mundo"
    val lista = listOf(1, 2, 3, 4, 5)

    println(cadena.formatearCadena())
    println(lista.calcularMedia())
}

fun String.formatearCadena(): String = this.replace(" ", "_")

fun List<Int>.calcularMedia(): Int = this.sum() / this.size