//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val producto = Producto("Laptop", 999.99, "Electrónica")
    val descripcion = descripcionProducto(producto)
    println(descripcion)
}

class Producto(
    val nombre: String,
    val precio: Double,
    val categoria: String
)

fun descripcionProducto(producto: Producto): String {
    return buildString {
        append("Nombre: ${producto.nombre}")
        append("\nPrecio: ${producto.precio}$")
        append("\nCategoria: ${producto.categoria}")
    }
}