package FunctionalProgrammingInScala

object curriedFunction extends App{
   val supadder :(Int , Int) => Int =(x:Int , y:Int ) => x+y

//   using curried function

   val supAdder : Int => Int => Int = (x:Int) => (y:Int) => x + y

   val add3 = supAdder (10)(30)

   println(add3)

   val add4 = supAdder( supAdder(5)(5) ) (35)

   println(add4)



}
