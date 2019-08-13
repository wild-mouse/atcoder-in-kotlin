package com.wildmouse.atcoder.contest.beginner.c136

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a_b_c = sc.nextLine()
            .split(" ")
            .map { Integer.parseInt(it) }
    val d = a_b_c[0] - a_b_c[1]
    val e = a_b_c[2] - d
    if (e < 0) {
        println(0)
    } else {
        println(e)
    }
}