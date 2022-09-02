fun main() {
    val count = 10
    var sum = 0
    for (i in 1..count step 2) {
        sum += i
    }
    println(sum)
}