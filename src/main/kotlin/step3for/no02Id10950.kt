package step3for

import java.util.Scanner

fun main(){
    val sc: Scanner = Scanner(System.`in`)
    val n: Int = sc.nextInt()

    for (i in 1..n) {
        val a: Int = sc.nextInt()
        val b: Int = sc.nextInt()
        println( a + b)
    }
}
