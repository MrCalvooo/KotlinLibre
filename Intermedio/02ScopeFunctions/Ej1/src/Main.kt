//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val perfil = Profile(
        email = "",
        name = "Juan Pérez",
        ajustes = "Preferencias de usuario"
    )

    val usuario = User(perfil)

    verificarUsuario(usuario)
}

// Creamos la clase Profile y la clase User
data class Profile(val email: String, val name: String, val ajustes: String)

// El perfil es opcional en la clase User
class User(val perfil: Profile?)

// Creamos la clase Notification con propiedades y métodos
data class Notification(val usuario: User, var titulo: String = "", var mensaje: String = "", var prioridad: Int = 0) {
    fun preparar() {
        println("Preparando notificación para ${usuario.perfil?.name}")
    }

    fun enviar() {
        println("Enviando notificación: $titulo - $mensaje")
    }

    fun log() {
        println("Notificación registrada: $titulo")
    }
}

// Función para verificar el usuario y enviar una notificación
fun verificarUsuario(usuario: User) {
    // Verificamos si el usuario tiene un perfil
    usuario.perfil?.let {

        // Creamos una notificación personalizada
        val notification = Notification(usuario).apply {
            titulo = "Hola ${it.name}"
            mensaje = "Bienvenido a la aplicación, ${it.name}!"
            prioridad = 1
        }
            // Avisamos que la notificación se ha registrado
            .also {
                println("Nueva notificación registrada")
            }
        // Llamamos a los métodos de la notificación
        with(notification) {
            preparar()
            enviar()
            log()
        }
    }
}