//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val productoNulo = Producto(
        nombre = null,
        stock = null,
        precio = null
    )

    val producto = Producto(
        nombre = "Laptop",
        stock = 5,
        precio = 1500.0
    )

    procesarProducto(productoNulo)

    procesarProducto(producto)
}

data class Producto(
    var nombre: String?,
    var stock: Int?,
    var precio: Double?
)

fun procesarProducto(producto: Producto) {

    if (producto.nombre == null || producto.stock == null || producto.precio == null) {
        println("Producto incompleto, se asignarán valores por defecto.")
    }

    with(producto) {
        nombre = nombre ?: "Producto desconocido"
        stock = stock ?: 0
        precio = precio ?: 10.0
    }

    producto.also {
        println(
            "Producto procesado: ${producto.nombre}, Stock: ${producto.stock}, " +
                    "Precio: ${producto.precio}"
        )
    }

}