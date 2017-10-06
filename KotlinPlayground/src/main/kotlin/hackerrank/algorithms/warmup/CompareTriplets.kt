package hackerrank.algorithms.warmup

fun main(args: Array<String>) {
    val aliceInput = readLine()
    val bobInput = readLine()

    val aliceValues = aliceInput!!.split(" ").map { it.toInt() }
    val bobValues = bobInput!!.split(" ").map { it.toInt() }

    var aliceScore = 0
    var bobScore = 0

    for (i in 0 until aliceValues.size) {
        if(aliceValues[i] > bobValues[i]) aliceScore++
        else if(aliceValues[i] < bobValues[i]) bobScore++
    }

    println("$aliceScore $bobScore")
}