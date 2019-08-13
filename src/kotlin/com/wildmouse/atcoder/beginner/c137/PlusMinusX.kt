package com.wildmouse.atcoder.beginner.c137

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a_b = sc.nextLine().split(" ").map { Integer.parseInt(it) }
    val pmx = mutableListOf<Int>()
    pmx.add(a_b[0] + a_b[1])
    pmx.add(a_b[0] - a_b[1])
    pmx.add(a_b[0] * a_b[1])
    println(pmx.max())
}