package Oops.SugarOperation

object prefixNotation extends App{
  class Person( val name:String ,val age:Int) {
        def unary_+ : Person = new Person(this.name , this.age+1)
  }
}
