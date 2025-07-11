//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    ConfiguracionApp.mostrarEstado()

    println("Activando modo oscuro...")
    ConfiguracionApp.activarModoOscuro()
    ConfiguracionApp.mostrarEstado()

    println("Desactivando modo oscuro...")
    ConfiguracionApp.desactivarModoOscuro()
    ConfiguracionApp.mostrarEstado()
}

object ConfiguracionApp {
    var modoOscuro: Boolean = false

    fun activarModoOscuro() {
        modoOscuro = true
    }

    fun desactivarModoOscuro() {
        modoOscuro = false
    }

    fun mostrarEstado() {
        println(
            "Modo oscuro está ${
                (if (modoOscuro) "activado" else "desactivado")
            }"
        )
    }
}