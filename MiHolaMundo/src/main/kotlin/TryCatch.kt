fun main() {
    var nombre : String? = null
    try {
        throw NullPointerException("Referencia nula")
    } catch (exception : NullPointerException) {
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido")
    }

    val primerValor = 10
    val segundoValor = 0
    val resultado : Int = try { primerValor / segundoValor } catch (exception : Exception) {0}
}