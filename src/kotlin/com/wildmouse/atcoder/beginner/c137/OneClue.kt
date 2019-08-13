package com.wildmouse.atcoder.beginner.c137

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k_x = sc.nextLine().split(" ").map { Integer.parseInt(it) }
    val max = 1000000
    val min = -1000000
    val a = mutableListOf<Int>()
    for (i in (k_x[1]-k_x[0] + 1) until (k_x[1]+k_x[0])) {
        if (i < min || i > max) continue
        a.add(i)
    }
    println(a.joinToString(" "))
}