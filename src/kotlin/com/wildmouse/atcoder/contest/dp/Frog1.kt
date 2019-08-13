package com.wildmouse.atcoder.contest.dp

import java.lang.Math.abs
import java.lang.Math.min
import java.util.*

fun main(args: Array<String>) {
    try {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        if (n < 2 || n > 100000) {
            throw Exception("Unexpected input.")
        }
        val hs = IntArray(n)
        for (i in 0 until n) {
            hs[i] = sc.nextInt()
        }
        val c = calcMinCost3(hs)
        println(c)
    } catch (e: Exception) {
        println(e)
    }
}

fun calcMinCost3(hs: IntArray): Int {
    val cs = IntArray(hs.size)
    cs[0] = 0
    cs[1] = abs(hs[0] - hs[1])
    for (i in 2 until hs.size) {
        cs[i] = min(
                cs[i - 2] + abs(hs[i - 2] - hs[i]),
                cs[i - 1] + abs(hs[i - 1] - hs[i])
        )
    }
    return cs[hs.size - 1]
}

// This algorithm is slow.
fun calcMinCost2(hs: IntArray, i: Int = 0, c: Int = 0): Int {
    if (hs.size - 1 == i) return c
    if (hs.size - 1 == i + 1) return c + abs(hs[i] - hs[i + 1])
    return min(
            calcMinCost2(hs, i + 1, c + abs(hs[i] - hs[i + 1])),
            calcMinCost2(hs, i + 2, c + abs(hs[i] - hs[i + 2]))
    )
}

// This algorithm is incorrect.
fun calcMinCost1(hs: IntArray, i: Int = 0, c: Int = 0): Int {
    if (hs.size - 1 == i) return c
    if (hs.size - 1 == i + 1) return c + abs(hs[i] - hs[i + 1])
    val c1 = abs(hs[i] - hs[i + 1])
    val c2 = abs(hs[i] - hs[i + 2])
    return if (c1 < c2) {
        calcMinCost1(hs, i + 1, c + c1)
    } else {
        calcMinCost1(hs, i + 2, c + c2)
    }
}
