package com.sierisimo.algorithms

/**
 * Created by Sier
 *
 */
fun main(args: Array<String>) {
    countdown(10)
    println(".....")
    countdown(9)
    println(".....")
    countdown(5)
    println(".....")
}

fun countdown(n: Int) {
    if (n < 10) {
        countdown(n + 1)
    }
    println(n)
}