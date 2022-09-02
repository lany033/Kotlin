fun main() {
    val listaDeFrutas = listOf("manzana","pera","fresa","durazno")

    for(fruta in listaDeFrutas) println("fruta: $fruta")

    listaDeFrutas.forEach { fruta -> println("fruta: $fruta")}

    val caracteresFruta = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresFruta)

    val listaFiltrada = caracteresFruta.filter { largoCaracter -> largoCaracter > 5 }

    println(listaFiltrada)
}