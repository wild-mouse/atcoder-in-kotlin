package com.wildmouse.atcoder.contest.beginner.c134

import java.util.*

fun main(args: Array<String>) {
    try {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val d = sc.nextInt()
        if (n < 1 || n > 20 || d < 1 || d > 20) {
            throw Exception("Unexpected input.")
        }
        val dd = 1 + 2 * d
        if ((n % dd) == 0) {
            println(n / dd)
        } else {
            println((n / dd) + 1)
        }
    } catch (e: Exception) {
        println(e)
    }
}