//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Llamamos a la función de extensión para poner en negrita el texto "hola"
    println("hola".bold())
}

// Creamos la función de extensión para la clase String en la cual usamos la etiqueta HTML <b> para poner en negrita el texto.
// Usamos $this para referirnos al objeto de tipo String que llama a la función
fun String.bold(): String = "<b>$this</b>"