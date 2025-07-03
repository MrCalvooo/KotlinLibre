//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var num1: Int
    var num2: Int
    var operacion: String
    do {

        println("Que operacion desea realizar? (suma, resta, multiplicacion, division): ")
        operacion = readln().lowercase()

        println("Ingrese el primer numero: ")
        num1 = readln().toInt()

        println("Ingrese el segundo numero: ")
        num2 = readln().toInt()

        if (num2 == 0) {
            println("Numero no valido")
        }

    } while (num2 == 0)

    val resultado = realizarOperacion(operacion, num1, num2)

    println("$operacion de $num1 y $num2 es: $resultado")
}

fun realizarOperacion(operacion: String, num1: Int, num2: Int): Int {
    var resultado = 0
    // Se utiliza when para determinar la operación a realizar
    when (operacion) {
        "suma" -> resultado = num1 + num2
        "resta" -> resultado = num1 - num2
        "multiplicacion" -> resultado = num1 * num2
        "division" -> resultado = num1 / num2
        // Si se ingresa una operación no válida, se realiza una suma por defecto
        else -> {
            resultado = num1 + num2
        }
    }
    return resultado
}

