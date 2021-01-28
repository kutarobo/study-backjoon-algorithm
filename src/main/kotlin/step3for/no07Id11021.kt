package step3for

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    var token = StringTokenizer(br.readLine())
    val N: Int = Integer.parseInt(token.nextToken())

    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..N){
        token = StringTokenizer(br.readLine())
        var a: Int = Integer.parseInt(token.nextToken())
        var b: Int = Integer.parseInt(token.nextToken())

        bw.write("Case #${i}: ${a+b}\n")
    }
    bw.flush()
    bw.close()
}