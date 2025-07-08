//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

}

// Creamos la clase Usuario con sus propiedades las cuales pueden ser nulas
data class Usuario(
    var nombre: String?,
    var correo: String?,
    var edad: Int?,
    var pais: String?
)

fun procesarUsuario(usuario: Usuario) {
    // Comprobamos si el usuario NO es nulo
    usuario?.let {
        println("Procesando usuario: ${it.nombre}")

        with(it) {
            if (correo == null) {
                println("Correo no proporcionado")
                correo = "Desconocido"
            }
            edad?.let { println("Edad desconocida") }
        }

        it.apply {
            pais = pais ?: "Desconocido"
        }.also {
            println("Listo para enviar")
        }
    } ?: {
        println("Usuario no proporcionado")
    }
}