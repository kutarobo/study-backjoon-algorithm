package step3for

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var token = StringTokenizer(br.readLine())

    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val loopNum = Integer.parseInt(token.nextToken())

    for (i in 1..loopNum){
        token = StringTokenizer(br.readLine())

        val a: Int = Integer.parseInt(token.nextToken())
        val b: Int = Integer.parseInt(token.nextToken())

        bw.write("${a+b}\n")
    }
    bw.flush()
}