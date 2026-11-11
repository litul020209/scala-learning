package Loops

import scala.io.StdIn._

// Given n = 12345, reverse it using a loop. Expected output: 54321. Do not use String conversion.

object ReverseNumber extends App{

        println("Enter a number: ")

        var num:Int = readInt()

        var res:Int = 0

        var end:Boolean = true

        while(end == true){
            
            var digit:Int = num % 10

            if ( res == 0){
                res = res + digit
            }else{
                res = (res*10) + digit
            }

            num = (num / 10).toInt

            if(num == 0){
                end = false
            }

        }

        println(s"the reverse number is $res")
}