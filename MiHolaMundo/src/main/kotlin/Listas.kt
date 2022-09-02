fun main() {
    //lista inmutable
    val listaDeNombres = listOf("Juan","maria","julio")

    //lista mutable
    val listaVacia = mutableListOf<String>()

    //AGREGAR ELEMENTO
    listaVacia.add("Juan")

    //OBTENER ELEMENTO
    val valorUsandoGet = listaVacia.get(0)
    val valorUsandoOperador = listaVacia[0]
    val primerValor = listaDeNombres.firstOrNull()

    //ELIMINAR ELEMENTO
    listaVacia.removeAt(0)
    listaVacia.add("maria")
    listaVacia.removeIf { caracteres -> caracteres.length > 3 }

    //ARRAY
    val myarray: Array<Int> = arrayOf(1,2,3,4)
    println("Nuestro array: $myarray")
    println("ARRAY como LISTA ${myarray.toList()}")


}