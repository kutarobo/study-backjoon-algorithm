package step3for

import java.util.*

fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    var sum: Int = 0
    for(i in (1..n)){
        sum += i
    }
    println(sum)
}