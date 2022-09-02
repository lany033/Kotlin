fun main() {
    fun invert(arr: IntArray): IntArray {

        for (i in arr.indices) {
            arr[i] *= -1
        }
        return arr
    }

    var array = intArrayOf(2,3,4,5)
    invert(array)
    println(array.toList())

}

