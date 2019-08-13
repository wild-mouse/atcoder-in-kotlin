package com.wildmouse.atcoder.contest.dp

import java.lang.Math.abs
import java.lang.Math.min
import java.util.*

fun main(args: Array<String>) {
    try {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val k = sc.nextInt()
        if (n < 2 || n > 100000 || k < 1 || k > 100) {
            throw Exception("Unexpected input.")
        }
        val hs = IntArray(n + 1)
        for (i in 1..n) {
            hs[i] = sc.nextInt()
        }
        val c = getMinimalCost(hs, k)
        println(c)
    } catch (e: Exception) {
        println(e)
    }
}

// TODO: this algorithm is incorrect.
fun getMinimalCost(hs: IntArray, k: Int): Int {
    val cs = IntArray(hs.size)
    cs[1] = 0
    for (j in 2 until hs.size) {
        var min = 100000
        for (l in j-1 downTo j-k) {
            if (l <= 0) {
                break
            }
            val c = cs[l] + abs(hs[l] - hs[j])
            if (min > c) min = c
        }
        cs[j] = min
    }
    return cs.last()
}

fun getMinimalCostLiteral(hs: IntArray): Int { //, i: Int, k: Int, cs: IntArray = IntArray(hs.size)): Int {
    val cs = IntArray(hs.size)
    cs[1] = 0
    cs[2] = cs[1] + abs(hs[1] - hs[2])
    cs[3] = min(
            cs[1] + abs(hs[1] - hs[3]),
            cs[2] + abs(hs[2] - hs[3])
    )
    cs[4] = min(
            min(
                    cs[1] + abs(hs[1] - hs[4]),
                    cs[2] + abs(hs[2] - hs[4])
            ),
            cs[3] + abs(hs[3] - hs[4])
    )
    cs[5] = min(
            min(
                    cs[1] + abs(hs[1] - hs[5]),
                    cs[2] + abs(hs[2] - hs[5])
            ),
            min(
                    cs[3] + abs(hs[3] - hs[5]),
                    cs[4] + abs(hs[4] - hs[5])
            )
    )
    return cs[3]
}