//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Palabra: ")
    val palabra = readln()

    println(palabra.lowerCaseString())
}

fun String.lowerCaseString(): String = this.lowercase()