fun main() {
    val nombre = "Maria"

    if (nombre.isNotEmpty()) println("El largo de la variable nombre es ${nombre.length}") else println("Error, la variable esta vacia")

    var mensaje : String = if(nombre.length > 4 ) {
        "Tu nombre es largo"
    } else if(nombre.isEmpty()){
        "Tu nombre esta vacio"
    } else {
        "Tienes un nombre corto"
    }
    println(mensaje)



}