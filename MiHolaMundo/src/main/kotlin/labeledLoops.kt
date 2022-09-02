fun main() {
    var sum = 0

    rowLoops@ for (row in 0 until 8){
        columnLoops@ for (column in 0 until 8){
            if (row == column) {
                continue@rowLoops
            }
            sum += row * column
        }
    }
}