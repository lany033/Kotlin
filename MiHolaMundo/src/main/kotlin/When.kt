fun main() {
    val nombreColor = "Amarillo"

    when(nombreColor){
        "Amarillo" -> println("El marillo es el color de la alegria")
        "Rojo","Carmesi" -> println("este color es el color de la pasion")
        else -> println("error: Unknown color")
    }

    val code = 200
    when (code) {
        in 200..299 -> println("Todo ha ido bien")
        in 400..500 -> println("Algo fallo")
        else -> println("Codigo unknown")
    }

    val tallaDeZapatos = 41
    val mensaje = when(tallaDeZapatos) {
        41,43 -> "Tenemos disponible"
        42,44 -> "Casi no queda u.u"
        45 -> "No hay :("
        else -> "Estos zapatos sol hay en 41,42,43,44,45"
    }

    println(mensaje)
}