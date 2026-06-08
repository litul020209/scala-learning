package Basics

import scala.io.StdIn._

object lcm extends App {

  print("x: ")
  var x = readInt()

  print("y: ")
  var y = readInt()

  def lcm(x:Int, y:Int): Int = {

    var max = Math.max(x,y)

    while(true){

      if(max % x == 0 && max % y == 0){
        return max
      }

      max += 1
    }

    0
  }

  println("LCM = " + lcm(x,y))

}