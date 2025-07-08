//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val usuario = Usuario().apply {
        name = "Carlos"
        email = "carlos@example.com"
    }

    iniciarSesion(usuario)
}

class Usuario() {
    var name = ""
    var email = ""
}

data class Session(
    val user: Usuario,
    val token: String,
    var status: String,
    var config: String
) {
    fun validar() {
        println("✅ Sesión validada para ${user.name}")
    }

    fun persistir() {
        println("💾 Sesión persistida en la base de datos")
    }

    fun mostrarResumen() {
        println("📋 Resumen: status=$status, token=$token, config=$config")
    }
}

fun iniciarSesion(user: Usuario) {
    // Verificar si el usuario es válido
    user.let {
        if (it.name.isEmpty() || it.email.isEmpty()) {
            throw IllegalArgumentException("Usuario inválido: nombre o email vacío")
        }
    }.apply {
        val session = Session(
            user = user,
            token = "abdc1234",
            status = "active",
            config = "default"
        )
    }.also {
        println("Sesión iniciada para el usuario: ${user.name}")
    }
}