package step3for

import java.util.Scanner

fun main () {
    val sc: Scanner = Scanner(System.`in`)
    val n: Int = sc.nextInt()

    for (i in 1..9) {
        println("${n} * ${i} = ${n * i}")
    }
}


