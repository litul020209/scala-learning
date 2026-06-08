package AnoymousFunction

import scala.annotation.tailrec

object lambda02 extends App{
  @tailrec
  def nTimes(f: Int => Int, n:Int, x:Int):Int =
    if ( n <= 0) x
    else nTimes(f,n-1,f(x))

  val res = (x:Int) => x+1

  println(nTimes(res,10,10))



}
