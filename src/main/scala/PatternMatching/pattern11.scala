package PatternMatching

object pattern11 extends App{
   val lst = List(1,2,3,4)

   val evenOne = for {
     x <- lst if x % 2 == 0
   }yield 10 * x

   println(evenOne)

   val head::tail = lst
   println(head)
   println(tail)
}
