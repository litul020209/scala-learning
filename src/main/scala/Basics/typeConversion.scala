package Basics

object  TypeConversion extends  App{
    var num :String = "10"

    var  num1 = num.toInt

    println(num1)

    println(num.getClass())
    
    println(num1.getClass())

    println(num1.isInstanceOf[Int])

    println(num.isInstanceOf[String])

    println(num1.isInstanceOf[Any])

}