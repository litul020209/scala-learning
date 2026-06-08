package Loops

import scala.io.StdIn._
import scala.util.control.Breaks._

object primeNumberCheck extends App {

  var num = readInt()

  var a = true

  breakable {

    for(i <- 2 until num){

      if(num % i == 0){
        a = false
        break()
      }

    }

  }

  if(a == true){
    println("Prime Number")
  }
  else{
    println("Composite Number")
  }

}
