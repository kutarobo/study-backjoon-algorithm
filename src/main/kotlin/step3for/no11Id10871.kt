package step3for

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))

    var token = StringTokenizer(br.readLine())
    val N: Int = Integer.parseInt(token.nextToken())
    val X: Int = Integer.parseInt(token.nextToken())

    val sb = StringBuilder()
    token = StringTokenizer(br.readLine())
    for (i in 1..N){
        val value: Int = Integer.parseInt(token.nextToken())
        if (value < X) {
            sb.append("${value} ")
        }
    }
    System.out.print(sb)
}