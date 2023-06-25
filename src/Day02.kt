fun main () {
    fun driveTheSub(input: List<String>): Int {
        var horizontal: Int = 0
        var depth: Int = 0

        for (s in input) {
            val direction = s.split(" ")[0]
            val distance = s.split(" ")[1].toInt()

            when (direction) {
                "forward" -> horizontal += distance
                "up" -> depth -= distance
                "down" -> depth += distance
            }
        }

        return horizontal * depth
    }

    println("Testing Day02 challenge: Drive!")
    val input = readInput("Day02_test")
    val result = driveTheSub(input)
    println("Result = $result")
    check(result == 150)
    println("Test passed!")

}