package ArrayVectroList

import scala.Tuple.Filter

object transferChain extends App {
  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val evenNum = numbers.filter(x => x % 2 == 0)

  println(evenNum)

  val mul3 = numbers.map(x => x * 3)

  println(mul3)

  val greater10 = numbers.filter(x => x > 10)

  println(greater10)



}
