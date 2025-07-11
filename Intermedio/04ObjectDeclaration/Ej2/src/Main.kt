//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    RegistroUsuarios.registrarUsuario("Juan")
    RegistroUsuarios.registrarUsuario("Clara")
    RegistroUsuarios.registrarUsuario("Ana")

    RegistroUsuarios.mostrarUsuarios()

    println("Eliminando usuario 'Clara':")
    println(RegistroUsuarios.eliminarUsuario("Clara"))
    RegistroUsuarios.mostrarUsuarios()

    println("Eliminar usuario 'Pedro':")
    println(RegistroUsuarios.eliminarUsuario("Pedro"))

}

class Usuario(val nombre: String)

object RegistroUsuarios {
    val listaUsuarios = mutableListOf<Usuario>()

    fun registrarUsuario(nombre: String): String {
        val usuario = Usuario(nombre)
        listaUsuarios.add(usuario)
        return "Usuario registrado"
    }

    fun eliminarUsuario(nombre: String): String {
        var mensaje: String = ""
        listaUsuarios.forEach {
            if (it.nombre == nombre) {
                listaUsuarios.remove(it)
                mensaje = "Usuario $nombre eliminado"
            } else {
                return "Usuario no encontrado"
            }
        }
        return mensaje
    }

    fun mostrarUsuarios() {
        if (listaUsuarios.isEmpty()) {
            println("No hay usuarios registrados.")
        } else {
            listaUsuarios.forEach {
                println(it.nombre)
            }
        }
    }
}