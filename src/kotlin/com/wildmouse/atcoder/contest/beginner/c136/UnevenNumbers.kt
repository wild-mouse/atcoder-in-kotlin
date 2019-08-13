package com.wildmouse.atcoder.contest.beginner.c136

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var c = 0
    for (i in 1..n) {
        if (i.toString().length % 2 == 0) {
            continue
        }
        ++c
    }
    println(c)
}