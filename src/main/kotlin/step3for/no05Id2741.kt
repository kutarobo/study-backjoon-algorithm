package step3for

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    val N = Integer.parseInt(token.nextToken())

    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..N){
        bw.write("${i}\n")
    }
    bw.flush()
}