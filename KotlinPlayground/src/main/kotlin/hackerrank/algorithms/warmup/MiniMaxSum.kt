package hackerrank.algorithms.warmup

fun main(args: Array<String>) {
    val intInput = readLine()!!.split(" ").map { it.toInt() }.sorted()
    val maxSum = intInput.foldRightIndexed(0){ idx, element, acc ->
        if(idx != 0) acc + element
        else acc
    }

    val minSum = intInput.foldIndexed(0){ idx, acc, element ->
        if(idx != 4) acc + element
        else acc
    }

    println("$minSum $maxSum")
}