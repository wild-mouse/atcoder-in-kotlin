package com.wildmouse.atcoder.contest.beginner.c135

import java.lang.Math.abs
import java.util.*

fun main(args: Array<String>) {
    try {
        val sc = Scanner(System.`in`)
        val a = sc.nextInt()
        val b = sc.nextInt()
        val kk = abs(a) + abs(b)
        if (kk % 2 != 0) {
            println("IMPOSSIBLE")
            return
        }
        val k = kk / 2
        println(k)
    } catch(e: Exception) {
        println(e)
    }
}