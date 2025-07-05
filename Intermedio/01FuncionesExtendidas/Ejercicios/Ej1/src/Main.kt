//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Write an extension function called isPositive that takes an integer and checks whether it is positive.

    println("Número: ")
    val number = readln().toInt()

    println("El número $number es positivo?: ${isPositive(number)}")
}

fun isPositive(number: Int): Boolean = number > 0