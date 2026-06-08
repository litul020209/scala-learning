package Recursions
import scala.io.StdIn._
object powerOfNumber extends App{
    print("enter the number: ")
    var num = readInt()
    print("enter the number: ")
    var e = readInt()

    def power( num:Int , e:Int , ans :Int):Int ={
        if (e == 1){
            ans
        }
        else{
          power(num , e - 1,ans * num)

        }
    }
    val res = power(5,3,5)
    println(res)

}
