package Basics

object ValuesVariablesTypes extends App {
//  datatypes and variables
//  var = mutable
    var x = 12
    println(x)
    x = 23
    println(x)

//  but x = "Hello" it will bw show error because if you put before int then you can change int also.

    var y:Any = 12
    y = "Hello" //This is Possible we can change the data type

//  val  = immutable
    val z = 12
//  we can not change the z varlue because it will show error.
//AnyVal = int,bool,double
//AnyRef = string,list,array

}
