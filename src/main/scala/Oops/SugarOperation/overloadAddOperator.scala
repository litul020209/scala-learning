package Oops.SugarOperation

object overloadAddOperator extends App{
  class Person(name:String , movie:String) {
      def + (name:String):Person = {
         new Person(name , this.movie)
      }

      
  }

}
