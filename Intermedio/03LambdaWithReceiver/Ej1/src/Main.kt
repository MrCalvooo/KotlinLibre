//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val usu = crearUsuario()
    mostrarUsuario(usu)
}

data class User(
    var nombre: String = "",
    var email: String = "",
    var activo: Boolean = false
)

fun crearUsuario(): User {
    return User().apply {
        nombre = "Juan Perez"
        email = "algo@algo"
        activo = true
    }
}

fun mostrarUsuario(usuario: User) {
    println("Nombre: ${usuario.nombre}, email: ${usuario.email}, activo: ${usuario.activo}")
}