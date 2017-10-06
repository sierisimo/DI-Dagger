package hackerrank.algorithms.warmup

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val candles = readLine()!!.split(" ").map { it.toInt() }

    var max = candles[0]
    var maxCount = 0

    for (i in 0 until n) {
        if (candles[i] == max) maxCount++
        else if (candles[i] > max) {
            max = candles[i]
            maxCount = 1
        }
    }

    println("$maxCount")
}