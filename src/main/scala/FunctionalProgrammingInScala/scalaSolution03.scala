package FunctionalProgrammingInScala

object scalaSolution03 extends App{
  def high01(arr:List[Int]  ) : Boolean =  arr.forall(x =>  x > 0)

  val num : List[Int] = List[Int](1,2,3)

  val char :List[Char] = List[Char]('A','B','C')


  val ans = for {
    c <- char
    i <- num
  } yield s"$c$i"
  println(ans)
}


