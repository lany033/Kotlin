fun main() {
    fun feast(beast: String, dish: String): Boolean {
        return if(beast.first() == dish.first()) {
            beast.last() == dish.last()
        } else {
            false
        }
    }

    val feast1 = feast("brown bear", "bear claw")
    println(feast1)
}

