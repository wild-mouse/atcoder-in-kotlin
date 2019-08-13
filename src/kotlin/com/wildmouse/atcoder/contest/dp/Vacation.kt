package com.wildmouse.atcoder.contest.dp

import java.util.*

fun main(args: Array<String>) {
    try {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        if (n < 1 || n > 10000) {
            throw Exception("Unexpected input.")
        }
        val hs = Array(n + 1) { Triple(0, 0, 0) }
        for (i in 1 .. n) {
            hs[i] = Triple(sc.nextInt(), sc.nextInt(), sc.nextInt())
        }
        val h = getMaximumHapinessLevel(hs)
        println(h)
    } catch (e: Exception) {
        println(e)
    }
}

fun getMaximumHapinessLevel(hs: Array<Triple<Int, Int, Int>>): Int {
    val hhs = IntArray(hs.size)
    var j = -1
    for (i in 1 until hs.size) {
        var m = 0
        var k = -1
        if (j != 0 && hs[i].first > m) {
            m = hs[i].first
            k =  0
        }
        if (j != 1 && hs[i].second > m) {
            m = hs[i].second
            k = 1
        }
        if (j != 2 && hs[i].third > m) {
            m = hs[i].third
            k = 2
        }
        hhs[i] = hhs[i-1] + m
        j = k
    }
    return hhs.last()
}