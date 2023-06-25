fun main() {
    fun countDescents(input: List<String>): Int {
        var increases = 0

        for (i in 1 until input.size) {
            if (input[i-1].toInt() < input[i].toInt()) increases++
        }

        return increases
    }

    println("Testing Day01 challenge: Sonar Sweep...")
    val input = readInput("Day01_test")
    val result = countDescents(input)
    println("Test result: $result")
    check(result == 7)
    println("Test passed!")
}
