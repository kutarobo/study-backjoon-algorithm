package step3for

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val N: Int = Integer.parseInt(token.nextToken())
    for (i in 1..N){
        for (j in 1..i) {
            bw.write("*")
        }
        bw.newLine()
    }
    bw.flush()
    bw.close()
}