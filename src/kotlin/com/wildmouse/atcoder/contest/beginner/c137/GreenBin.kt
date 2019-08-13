package com.wildmouse.atcoder.contest.beginner.c137

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = Integer.parseInt(sc.nextLine())
    val ws = mutableListOf<String>()
    for (i in 0 until n) {
        val w = sc.nextLine().toCharArray()
        w.sort()
        ws.add(w.joinToString(""))
    }
    var c: Long = 0
    for (i in 0 until ws.size) {
        for (j in i + 1 until ws.size) {
            if (ws[i] == ws[j]) c++
        }
    }
    println(c)
}