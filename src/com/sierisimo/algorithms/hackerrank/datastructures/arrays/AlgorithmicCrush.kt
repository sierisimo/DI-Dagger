package com.sierisimo.algorithms.hackerrank.datastructures.arrays

/**
 * Created by Sinuhe_Jaime on 6/9/2017.
 */
fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    readLine()?.let {
        val nm = it.split(" ").map { it.toInt() }
        val n = nm.first()
        val m = nm.last()

        val operationsArray = mutableListOf<List<Long>>()
        (1..m).forEach {
            readLine()?.let {
                operationsArray.add(it.split(" ").map { it.toLong() })
            }
        }

//        println(crush(n, m, operationsArray.toList()))
        println(sumCrush(n, m, operationsArray.toList()))

    }
}

fun sumCrush(n: Int, m: Int, operationsArray: List<List<Long>>): Long {
    val zeroArray = Array<Long>(n + 1, { _ -> 0 })
    var maxValue = 0L
    var x: Long = 0

    for (it in (0..m - 1)) {
        val operation = operationsArray[it]

        val a: Long = operation[0]
        val b: Long = operation[1]
        val k: Long = operation[2]

        zeroArray[a.toInt()] += k
        if (b + 1 <= n) zeroArray[(b + 1).toInt()] -= k
    }

    for (i in (1..n)) {
        x += zeroArray[i]
        if (x > maxValue) maxValue = x
    }

    return maxValue
}

fun crush(n: Int, m: Int, operationsArray: List<List<Long>>): Long {
    val zeroArray = Array<Long>(n + 1, { _ -> 0 })
    var maxVal = 0L

    (0..m - 1).forEach {
        val operation = operationsArray[it]

        val a: Long = operation[0]
        val b: Long = operation[1]
        val k: Long = operation[2]

        (a..b).forEach {
            val currentValue = zeroArray[it.toInt()] + k

            if (currentValue > maxVal) maxVal = currentValue

            zeroArray[it.toInt()] = currentValue
        }
    }

    return maxVal
}