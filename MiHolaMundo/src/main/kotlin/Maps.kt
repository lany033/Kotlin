fun main() {
    val edadDeSuperherores = mapOf(
        "Ironman" to 35,
        "Spiderman" to 20,
        "Caporal" to 30,
    )
    //println(edadDeSuperherores)

    //LISTA MUTABLE
    val edadDeSuperheroresMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 20,
        "Caporal" to 30,
    )
    println(edadDeSuperheroresMutable)

    edadDeSuperheroresMutable.put("Wolverine",45)
    println(edadDeSuperheroresMutable)

    edadDeSuperheroresMutable["Storm"] = 30
    println(edadDeSuperheroresMutable)

    //Conocer value
    val edadIronman = edadDeSuperheroresMutable["Ironman"]

    //Remover elemento
    edadDeSuperheroresMutable.remove("Wolverine")
    println(edadDeSuperheroresMutable)

    println(edadDeSuperheroresMutable.keys)
    println(edadDeSuperheroresMutable.values)
}